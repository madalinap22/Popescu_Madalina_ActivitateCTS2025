package Builder.classes;

public class Pacient {
    Boolean arePatRabatabil;
    Boolean areMicDejunInclus;
    Boolean arePapuciCamera;


    Pacient(Boolean arePatRabatabil, Boolean areMicDejunInclus, Boolean arePapuciCamera) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
    }

    void setArePatRabatabil(Boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    void setAreMicDejunInclus(Boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    void setArePapuciCamera(Boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append('}');
        return sb.toString();
    }
}

