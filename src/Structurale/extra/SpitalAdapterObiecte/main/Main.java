package Structurale.extra.SpitalAdapterObiecte.main;

import Structurale.extra.SpitalAdapterObiecte.model.Adapter;
import Structurale.extra.SpitalAdapterObiecte.model.IMedicament;
import Structurale.extra.SpitalAdapterObiecte.model.Medicament;
import Structurale.extra.SpitalAdapterObiecte.model.softNou.IReteta;
import Structurale.extra.SpitalAdapterObiecte.model.softNou.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IMedicament medicament = new Medicament("paracetamol", 23f,10);
        medicament.achizitioneazaMedicament();

        List<String> lista = new ArrayList<>();
        lista.add("ibuprofen");
        lista.add("paracetamol");

        IReteta reteta = new Reteta(111, lista);
        reteta.printeazaReteta();

        System.out.println("Exemplificare Adapter:");
        Adapter adapter = new Adapter(reteta);
        adapter.achizitioneazaMedicament();
    }
}
