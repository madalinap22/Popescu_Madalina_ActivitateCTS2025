package Structurale.AdapterClase.classes.framework;

public abstract class Masina {
    private String model;
    private int km;

    public Masina(String model, int km) {
        this.model = model;
        this.km = km;
    }

    public String getModel() {
        return model;
    }

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", km=").append(km);
        sb.append('}');
        return sb.toString();
    }

    public abstract void inchiriazaMasina();

}
