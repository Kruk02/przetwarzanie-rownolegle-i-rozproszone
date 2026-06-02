public class Main {
    public static void main(String[] args) throws InterruptedException {
        Koordynator_zadan koordynator = new Koordynator_zadan();
        Thread p1 = new Thread(new Pracownik("A", koordynator));
        Thread p2 = new Thread(new Pracownik("B", koordynator));
        Thread p3 = new Thread(new Pracownik("C", koordynator));

        p1.start(); p2.start(); p3.start();

        for (int i = 0; i <=100; i++) {
            koordynator.dodaj_zadanie(i);
        }
        koordynator.zakoncz_prace();

        p1.join(); p2.join(); p3.join();

        System.out.println("Wszystkie zadania zakonczone");
        }
    }
