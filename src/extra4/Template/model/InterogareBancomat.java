package extra4.Template.model;

public class InterogareBancomat extends ABancomat{
    public InterogareBancomat(String serieCard) {
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
    public void specificaSuma(String serie){
        System.out.println("Nu s-a specificat suma");
    }

    @Override
    public void retragereSuma(String serie){
        System.out.println("Nu s-au retras bani");
    }

    @Override
    public void retragereCard(String serie) {
        System.out.println("Cardul a fost retras din bancomat");
    }
}
