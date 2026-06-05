public class Producent implements Runnable {
    private Bufor bufor;
    private int ile_liczb;


    public Producent(Bufor bufor, int ile_liczb) {
        this.bufor = bufor;
        this.ile_liczb = ile_liczb;
    }


    @Override
    public void run(){
        for (int i = 1; i <= ile_liczb; i++) {
            bufor.dodaj(i);
        }
        bufor.zakoncz_produkcje();
        System.out.println("Producent zakonczyl produkje");
    }
}
