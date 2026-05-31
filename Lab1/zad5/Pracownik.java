public class Pracownik {
    String imie;
    int wiek;

    public void przedstaw_sie(){
        System.out.println("Czesc, mam na imie " + imie + " i mam " + wiek + "lat");
    }
public Pracownik(String nImie, int nWiek){
        this.imie = nImie;
        this.wiek = nWiek;
}
}
