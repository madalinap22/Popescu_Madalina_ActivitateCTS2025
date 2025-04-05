package Structurale.extra.SpitalAdapterObiecte.model.softNou;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta{

    private int nrReteta;
    private List<String> listaMedicamente = new ArrayList<>();

    public Reteta(int nrReteta, List<String> listaMedicamente) {
        this.nrReteta = nrReteta;
        this.listaMedicamente = listaMedicamente;
    }

    @Override
    public void printeazaReteta() {
        System.out.println("S-a printat reteta cu numarul "+nrReteta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nrReteta=").append(nrReteta);
        sb.append(", listaMedicamente=").append(listaMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
