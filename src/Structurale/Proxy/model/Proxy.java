package Structurale.Proxy.model;

public class Proxy implements IPachetTuristic{
    private PachetTuristic pachetTuristic;

    public Proxy(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Proxy{");
        sb.append("pachetTuristic=").append(pachetTuristic);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        pachetTuristic.descriere();
    }

    @Override
    public void rezervaPachet() {
        if(pachetTuristic.getPersoana().getVarsta() > 65) {
            pachetTuristic.rezervaPachet();
        }
        else{
            System.out.println("Nu are varsta eligibila");
        }
    }
}
