public class Main {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("Karol", 19);
        Pracownik p2 = new Pracownik("Kamil", 24);
        Kierownik k1 = new Kierownik("Kacper", 31, "IT");

        System.out.println("Liczba pracownikow : " + Pracownik.licznik);
    }
}
