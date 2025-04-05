package Creationale.Singleton.SingletonRegistry2;

public class Main {
    public static void main(String[] args) {

        ICompanieLivrare pachet = Pachet.getInstance("Nume1", "20.03.2025", 250);
      pachet.preluarePachet((APachet) pachet);

        ICompanieLivrare pachet2 = Pachet.getInstance("Nume1", "30.04.2025", 1000);
        pachet2.preluarePachet((APachet) pachet2);

        System.out.println(pachet == pachet2);
    }
}
