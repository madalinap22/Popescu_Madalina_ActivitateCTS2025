package Creationale.Builder.classes;

public class Pacient {
    Boolean arePatRabatabil;
    Boolean areMicDejunInclus;
    Boolean arePapuciCamera;
    Boolean areHalat;


    Pacient(Boolean arePatRabatabil, Boolean areMicDejunInclus, Boolean arePapuciCamera,Boolean areHalat) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalat= areHalat;
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

   void setAreHalat(Boolean areHalat) {
        this.areHalat = areHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalat=").append(areHalat);
        sb.append('}');
        return sb.toString();
    }
}

