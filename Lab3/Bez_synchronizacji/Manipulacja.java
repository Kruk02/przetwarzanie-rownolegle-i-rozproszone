import java.util.concurrent.TimeUnit;
public class Manipulacja {
    private double liczba;
    public Manipulacja(double licznik){
        this.liczba = liczba;
    }

    public double wykonaj_bez_synchronizacji(){
        liczba -= 10;
        pauza();
        liczba *= 2;
        pauza();
        liczba /= 2;
        pauza();
        liczba += 10;
        return liczba;
    }
    public double pobierz_liczbe(){
        return liczba;
    }
    private void pauza(){
        try{
            TimeUnit.MICROSECONDS.sleep(15);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
