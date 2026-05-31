public class Main {
    public static int kwadrat_liczby(int liczba){
        return liczba*liczba;
    }
    public static double wieksza_liczba(double pierwsza, double druga){
        if (pierwsza > druga) {return pierwsza;}
        else {return druga;}
    }
    public static void main(String[] args) {
        System.out.println("\nZadanie 4.");
        System.out.println("Kwadrat liczby 44 : " + kwadrat_liczby(44));
        System.out.println("Z liczbb 9.04 i 9.041 wieksza jest : " + wieksza_liczba(9.04,9.041));

    }
}
