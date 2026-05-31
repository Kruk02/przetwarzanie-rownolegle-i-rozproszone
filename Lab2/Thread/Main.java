public class Main {
    public static void main(String[] args) {
    Pracownik p1 = new Pracownik("A");
    Pracownik p2 = new Pracownik("B");
    Pracownik p3 = new Pracownik("C");


    Thread t1 = new Thread(p1);
    Thread t2 = new Thread(p2);
    Thread t3 = new Thread(p3);

    t1.start();
    t2.start();
    t3.start();
    try {
        t1.join();
        t2.join();
        t3.join();
    }catch (InterruptedException e){
        System.out.println("Przerwano oczekiwanie");
    }
        System.out.println("Wszystkie watki skonczyly prace");
    }
}

2
