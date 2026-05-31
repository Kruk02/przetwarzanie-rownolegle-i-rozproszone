public class Test implements Runnable {
    private Manipulacja manipulacja;
    public Test(Manipulacja manipulacja){
        this.manipulacja = manipulacja;
    }
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            double wynik = manipulacja.wykonaj_z_synchronizacja();

            if (wynik < 0){
                System.out.println("Blad : wynik ujemny : " + wynik);
                return;
            }
        }
    }
}
