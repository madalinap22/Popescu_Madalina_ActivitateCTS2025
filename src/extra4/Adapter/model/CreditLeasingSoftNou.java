package extra4.Adapter.model;

public class CreditLeasingSoftNou extends ACreditSoftNou {

    public CreditLeasingSoftNou(String nrCreditLeasing) {
        super(nrCreditLeasing);
    }

    @Override
    public void oferaCreditLeasing() {
        System.out.println("S-a oferit credit Leasing cu numarul:" + getNrCreditLeasing());
    }
}
