package extra4.Adapter.model;

public class Adaptor extends CreditLeasingSoftNou implements ICreditBasic{


    public Adaptor(String nrCreditLeasing) {
        super(nrCreditLeasing);
    }

    @Override
    public void oferaCredit() {
    super.oferaCreditLeasing();
    }
}
