public class Main {
    public static void main(String[] args) {
        Manipulacja manipulacja = new Manipulacja(10);

        Thread t1 = new Thread(new Test(manipulacja));
        Thread t2 = new Thread(new Test(manipulacja));
        Thread t3 = new Thread(new Test(manipulacja));
        Thread t4 = new Thread(new Test(manipulacja));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
