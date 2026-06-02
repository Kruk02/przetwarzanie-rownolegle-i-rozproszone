public class Pracownik implements Runnable {
    private String nazwa;
    private Koordynator_zadan koordynator;

    public Pracownik(String nazwa, Koordynator_zadan koordynator){
        this.nazwa = nazwa;
        this.koordynator = koordynator;
    }

    @Override
    public void run(){
        while(true){
            Integer zadanie = koordynator.pobierz_zadanie();

            if (zadanie == null){
                System.out.println("Praconik " + nazwa + " konczy prace");
                return;
            }
            int wynik = zadanie * zadanie;
            System.out.println("Pracownik " + nazwa + " wykonal zadanie " + zadanie + ", wynik = " + wynik);
        }
    }
}
