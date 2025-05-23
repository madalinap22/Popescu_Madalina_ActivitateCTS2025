package extra4.Proxy.model;

public class Credit implements ICont{
    private boolean esteRON;

    public Credit(boolean esteRON) {
        this.esteRON = esteRON;
    }

    public boolean isEsteRON() {
        return esteRON;
    }

    @Override
    public void deschidereCont() {
        System.out.println("S-a deschis un cont");
    }
}
