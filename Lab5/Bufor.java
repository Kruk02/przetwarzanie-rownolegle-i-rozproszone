import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Bufor {
    private final Queue<Integer> bufor = new LinkedList<>();
    private final int pojemnosc = 5;
    private boolean zakonczono_produkcje = false;


    private final Lock lock = new ReentrantLock();
    private final Condition nie_pusty = lock.newCondition();
    private final Condition nie_pelny = lock.newCondition();


    public void dodaj(int liczba) {
        lock.lock();
        try {
            while (bufor.size() == pojemnosc) {
                try {
                    nie_pelny.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }


            bufor.add(liczba);
            System.out.println("Dodano do bufora: " + liczba);
            nie_pusty.signalAll();
        } finally {
            lock.unlock();
        }
    }
    public Integer pobierz(){
        lock.lock();
        try{
            while(bufor.isEmpty() && !zakonczono_produkcje) {
                try{
                    nie_pusty.await();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
            if (bufor.isEmpty() && zakonczono_produkcje){
                return null;
            }
            Integer liczba = bufor.poll();
            nie_pelny.signalAll();
            return liczba;
        }finally {
            lock.unlock();
        }
    }
    public void zakoncz_produkcje(){
        lock.lock();
        try {
            zakonczono_produkcje = true;
            nie_pusty.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
