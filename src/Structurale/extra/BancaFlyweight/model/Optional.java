package Structurale.extra.BancaFlyweight.model;

public class Optional {
    private String numeBanca;
    private String sucursala;
    private int capital;
    private int nrCont;
    private int sumaCont;

    public Optional(String numeBanca, String sucursala, int capital, int nrCont, int sumaCont) {
        this.numeBanca = numeBanca;
        this.sucursala = sucursala;
        this.capital = capital;
        this.nrCont = nrCont;
        this.sumaCont = sumaCont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Optional{");
        sb.append("numeBanca='").append(numeBanca).append('\'');
        sb.append(", sucursala='").append(sucursala).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrCont=").append(nrCont);
        sb.append(", sumaCont=").append(sumaCont);
        sb.append('}');
        return sb.toString();
    }
}
