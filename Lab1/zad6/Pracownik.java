public class Pracownik {
    String imie;
    int wiek;
    static int licznik = 0;

    public void przedstaw_sie(){
        System.out.println("Czesc, mam na imie " + imie + " i mam " + wiek + "lat");
    }
    public void pokaz_licznik(){
        System.out.println("Liczba pracownikow : " + licznik);
    }
public Pracownik(String nImie, int nWiek){
        this.imie = nImie;
        this.wiek = nWiek;
        licznik++;
}
}
