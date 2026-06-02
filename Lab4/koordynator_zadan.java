import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Koordynator_zadan {
    private Queue<Integer> zadania = new LinkedList<>();
    private boolean koniec_pracy = false;

    private final Lock lock = new ReentrantLock();
    private final Condition sa_zadania = lock.newCondition();

    public void dodaj_zadanie(int zadanie){
        lock.lock();
        try{
            zadania.add(zadanie);
            sa_zadania.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public Integer pobierz_zadanie() {
        lock.lock();
        try {
            while (zadania.isEmpty() && !koniec_pracy) {
                try {
                    sa_zadania.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            }

            if (zadania.isEmpty() && koniec_pracy) {
                return null;
            }

            return zadania.poll();
        } finally {
            lock.unlock();
        }
    }
    public void zakoncz_prace(){
        lock.lock();
        try{
            koniec_pracy = true;
            sa_zadania.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
