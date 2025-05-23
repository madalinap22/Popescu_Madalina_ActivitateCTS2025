package extra4.Flyweight.model;

public class Optional {
    private String numeBanca;
    private String Sucursala;
    private String nrCont;

    public Optional(String numeBanca, String sucursala, String nrCont) {
        this.numeBanca = numeBanca;
        Sucursala = sucursala;
        this.nrCont = nrCont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Optional{");
        sb.append("numeBanca='").append(numeBanca).append('\'');
        sb.append(", Sucursala='").append(Sucursala).append('\'');
        sb.append(", nrCont='").append(nrCont).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
