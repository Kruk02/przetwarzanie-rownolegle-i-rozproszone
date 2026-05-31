public class Pracownik implements Runnable {
 private String nazwa;
 public Pracownik(String nazwa){
     this.nazwa = nazwa;
 }
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Pracownik " + nazwa + " wykonuje krok " + i);
        }
    }
}
