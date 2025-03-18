package Prototype.main;

import Prototype.classes.IReteta;
import Prototype.classes.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaIngrediente1 = new ArrayList<>();
        listaIngrediente1.add("ibuprofen");
        listaIngrediente1.add("paracetamol");

        Reteta r1 = new Reteta("reteta1",listaIngrediente1);

        List<String> listaIngrediente2 = new ArrayList<>();
        listaIngrediente2.add("excipient");
        listaIngrediente2.add("vitamina C");

        Reteta r2= new Reteta("reteta2",listaIngrediente2);

        System.out.println(r1);
        System.out.println(r2);

        IReteta r3 = r1.clone();
        System.out.println("Reteta clonata: " + r3);
        IReteta r4 = r2.clone();
        System.out.println("Reteta clonata: " + r4);


    }
}
