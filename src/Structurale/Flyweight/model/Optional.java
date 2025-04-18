package Structurale.Flyweight.model;

public class Optional {
    private boolean cina;
    private int nrExcursii;

    public Optional(boolean cina, int nrExcursii) {
        this.cina = cina;
        this.nrExcursii = nrExcursii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Optional{");
        sb.append("cina=").append(cina);
        sb.append(", nrExcursii=").append(nrExcursii);
        sb.append('}');
        return sb.toString();
    }
}
