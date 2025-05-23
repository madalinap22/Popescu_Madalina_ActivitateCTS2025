package extra4.Template.model;

public class RetragereBancomat extends ABancomat{
    public RetragereBancomat(String serieCard) {
        super(serieCard);
    }

    @Override
    public void introduceCard(String serie) {
        System.out.println("S-a introdus cardul " + serie);
    }

    @Override
    public void introducePin(String serie) {
        System.out.println("S-a introdus pinul pentru cardul cu seria " + serie);
    }

    @Override
    public void specificaSuma(String serie)  {
        System.out.println("S-a specificat suma pentru cardul cu seria " + serie);
    }

    @Override
    public void retragereSuma(String serie) {
        System.out.println("S-au retras banii din cardul cu seria " + serie);
    }

    @Override
    public void retragereCard(String serie) {
        System.out.println("Cardul a fost retras din bancomat");
    }
}
