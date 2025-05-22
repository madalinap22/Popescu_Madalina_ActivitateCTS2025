package extra3.I_Strategy.model;

public class AerConditionat implements ISistem{
    private String model;
    private ISistem sistem;

    public AerConditionat(String model, ISistem sistem) {
        this.model = model;
        this.sistem = sistem;
    }

    public void setSistem(ISistem sistem) {
        this.sistem = sistem;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void pornesteProgram() {
        sistem.pornesteProgram();
    }

    @Override
    public void seteazaProgram() {
     setSistem(this.sistem);
    }

    @Override
    public void finalizareProgram() {
        sistem.finalizareProgram();
    }
}
