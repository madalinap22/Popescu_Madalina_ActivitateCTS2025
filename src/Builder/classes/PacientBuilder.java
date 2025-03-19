package Builder.classes;

public class PacientBuilder implements IBuilder{

    private Pacient pacient;

    //var cu o optiune obligatorie
    public PacientBuilder(Boolean arePatRabatabil) {
        this.pacient = new Pacient(arePatRabatabil,false,false, false);
    }

   public PacientBuilder setArePatRabatabil(Boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDejunInclus(Boolean areMicDejunInclus) {
        this.pacient.setAreMicDejunInclus(areMicDejunInclus);
        return this;
    }

   public PacientBuilder setArePapuciCamera(Boolean arePapuciCamera) {
        this.pacient.setArePapuciCamera(arePapuciCamera);
        return this;
    }

    public PacientBuilder setAreHalat(Boolean areHalat) {
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PacientBuilder{");
        sb.append("pacient=").append(pacient);
        sb.append('}');
        return sb.toString();
    }
}
