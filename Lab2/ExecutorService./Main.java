import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(new Pracownik("A"));
        executor.execute(new Pracownik("B"));
        executor.execute(new Pracownik("C"));

        executor.shutdown();
        System.out.println("Zadania zostaly przekazane do ExecutorService");
    }
}
