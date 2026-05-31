public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1. Rozpoczynam laboratorium");
        System.out.println("Zadanie 2.");
        int l1 = 41; int l2 = 7; int wynik = (l1+l2);
        System.out.println("Dodawanie : " + l1 + " + " + l2 + " = " + (l1+l2));
        System.out.println("Odejmowanie : " + l1 + " - " + l2 + " = " + (l1-l2));
        System.out.println("Mnozenie : " + l1 + " * " + l2 + " = " + (l1*l2));
        System.out.println("Dzielenie : " + l1 + " / " + l2 + " = " + (l1/l2));
        System.out.println("Modulo : " + l1 + " % " + l2 + " = " + (l1%l2));

        System.out.println("\nZadanie 3.");
        int wybrana_liczba = 7;
        System.out.println("Wybrana liczba : " + wybrana_liczba);
        if (wybrana_liczba % 2 == 0) { System.out.println("Liczba " + wybrana_liczba + " jest parzysta"); }
        else { System.out.println("Liczba " + wybrana_liczba + " nie jest parzysta");};

        for (int i = 1; i <= 10; i++){
            System.out.println("i = " + i);
        }
        int suma = 0;
        for (int l = 1; l <= wybrana_liczba; l++){
            suma += l;
        }
        System.out.println("Suma liczb od 1 do " + wybrana_liczba + " to : " + suma);

    }
}
