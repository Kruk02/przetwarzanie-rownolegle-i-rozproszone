public class Konsument implements Runnable {
    private String nazwa;
    private Bufor bufor;


    public Konsument(String nazwa, Bufor bufor){
        this.nazwa = nazwa;
        this.bufor = bufor;
    }
    @Override
    public void run(){
        while (true){
            Integer liczba = bufor.pobierz();
            if (liczba == null){
                System.out.println("Konsument " + nazwa + " konczy prace");
                return;
            }
            int wynik = liczba * liczba;
            System.out.println("Konsument " + nazwa + " pobral zadanie nr: " + liczba + ", kwadrat = " + wynik);
        }
    }
}
