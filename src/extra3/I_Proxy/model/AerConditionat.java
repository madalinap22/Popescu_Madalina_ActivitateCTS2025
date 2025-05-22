package extra3.I_Proxy.model;

public class AerConditionat implements ISistem{
    private String model;
    private boolean areCurent;
    private boolean areFreon;

    public AerConditionat(String model, boolean areCurent, boolean areFreon) {
        this.model = model;
        this.areCurent = areCurent;
        this.areFreon = areFreon;
    }

    public boolean isAreCurent() {
        return areCurent;
    }

    public boolean isAreFreon() {
        return areFreon;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void pornesteProgram() {

    }

    @Override
    public void seteazaProgram() {

    }

    @Override
    public void finalizareProgram() {

    }
}
