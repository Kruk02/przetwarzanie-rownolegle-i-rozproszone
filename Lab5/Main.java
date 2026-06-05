public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bufor bufor = new Bufor();


        Thread producent = new Thread(new Producent(bufor, 20));
        Thread konsument1 = new Thread(new Konsument("A", bufor));
        Thread konsument2 = new Thread(new Konsument("B", bufor));


        producent.start();
        konsument1.start();
        konsument2.start();


        producent.join();
        konsument1.join();
        konsument2.join();


        System.out.println("Program zakonczyl dzialanie");
    }
}
