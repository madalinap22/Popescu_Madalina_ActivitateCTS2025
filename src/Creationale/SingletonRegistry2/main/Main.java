package Creationale.SingletonRegistry2.main;

import Creationale.SingletonRegistry2.classes.Cuptor;
import Creationale.SingletonRegistry2.classes.CuptorMultiplu;
import Creationale.SingletonRegistry2.classes.Preparat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Preparat p1 = new Preparat("pizza", 45, 280);
        Preparat p2 = new Preparat("paine", 30, 180);
        Preparat p3 = new Preparat("cozonac", 60, 200);

        List<Preparat> lista1 = new ArrayList<>();
        lista1.add(p1);
        lista1.add(p2);
        lista1.add(p3);
        System.out.println(lista1);

        Cuptor.getInstance().addPreparat(p1);
        Cuptor.getInstance().addPreparat(p2);
        Cuptor.getInstance().addPreparat(p3);
        System.out.println(Cuptor.getInstance());


        //
        List<Preparat> lista2= new ArrayList<>();
        lista2.add(p1);
        lista2.add(p2);
        CuptorMultiplu cm = CuptorMultiplu.getInstance(1);
        System.out.println("Cuptor multiplu: "+cm);

       CuptorMultiplu.addPreparat(p1);
       CuptorMultiplu.addPreparat(p2);

       cm.afisare();



    }
}
