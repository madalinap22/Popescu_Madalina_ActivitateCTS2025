package extra3.I_Decorator.model;

import java.util.List;

public class Produs implements IProdus{

    private String denProdus;
    private List<String> ingrediente;

    private float pret;

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public Produs(String denProdus, List<String> ingrediente, float pret) {
        this.denProdus = denProdus;
        this.ingrediente = ingrediente;
        this.pret = pret;
    }

    @Override
    public void getDescriereIngrediente() {
        System.out.println("Produsul " + denProdus + " are urmatoarele ingrediente: ");
        for (var elem:ingrediente) {
            System.out.println(elem + " ");
        }
    }

    @Override
    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("denProdus='").append(denProdus).append('\'');
        sb.append(", ingrediente=").append(ingrediente);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
