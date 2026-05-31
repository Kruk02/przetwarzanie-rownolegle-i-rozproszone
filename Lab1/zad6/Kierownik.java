public class Kierownik extends Pracownik {
    String dzial;

    public Kierownik(String imie, int wiek, String dzial){
        super(imie, wiek);
        this.dzial = dzial;
    }
}
