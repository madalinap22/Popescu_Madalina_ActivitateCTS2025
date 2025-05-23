package extra4.Adapter.model;

public class CreditBasic implements ICreditBasic{
    private String numeClient;

    public CreditBasic(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void oferaCredit() {
        System.out.println("S-a oferit creditul basic pentru " + numeClient);
    }
}
