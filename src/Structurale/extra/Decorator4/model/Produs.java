package Structurale.extra.Decorator4.model;

import java.util.ArrayList;
import java.util.List;

public class Produs implements IProdus{
    private String denumire;
    private float pret;
    private List<String> listaIngrediente = new ArrayList<>();

    public Produs(String denumire, float pret, List<String> listaIngrediente) {
        this.denumire = denumire;
        this.pret = pret;
        this.listaIngrediente = listaIngrediente;
    }

    public List<String> getListaIngrediente() {
        return listaIngrediente;
    }

    @Override
    public void getDescriereIngrediente() {
        System.out.println("Produsul "+denumire +"are urmatoarele ingrediente: ");
        for (var elem: listaIngrediente) {
            System.out.println(elem+ " ");
        }
    }

    @Override
    public float getPret() {
        return this.pret;
    }

    public void comandaProdusBaza(){
        System.out.println("Produsul "+ this.denumire +" de baza a fost comandat");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", listaIngrediente=").append(listaIngrediente);
        sb.append('}');
        return sb.toString();
    }
}
