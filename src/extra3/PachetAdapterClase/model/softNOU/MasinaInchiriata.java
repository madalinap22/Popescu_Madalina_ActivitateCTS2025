package extra3.PachetAdapterClase.model.softNOU;

public class MasinaInchiriata extends AMasina{
    public MasinaInchiriata(String modelMasina) {
        super(modelMasina);
    }

    @Override
    public void inchiriazaMasina() {
        System.out.println("S-a inchiriat masina cu modelul: "+ getModelMasina());
    }
}
