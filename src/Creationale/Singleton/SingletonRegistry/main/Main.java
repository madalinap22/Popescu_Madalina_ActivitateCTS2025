package Creationale.Singleton.SingletonRegistry.main;

import Creationale.Singleton.SingletonRegistry.classes.Pachet;

public class Main {
    public static void main(String[] args) {

        Pachet pachet = Pachet.getInstance("Lisbon",5000);
        System.out.println(pachet);

        Pachet pachet1 = Pachet.getInstance("Lisbon", 4200);
        System.out.println(pachet1);
    }
}