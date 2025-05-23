package extra3.PachetAdapterClase.model.softNOU;

public abstract class AMasina {
    private String modelMasina;

    public String getModelMasina() {
        return modelMasina;
    }

    public AMasina(String modelMasina) {
        this.modelMasina = modelMasina;
    }

    public abstract void inchiriazaMasina();
}
