package extra4.Adapter.main;

import extra4.Adapter.model.Adaptor;
import extra4.Adapter.model.CreditBasic;
import extra4.Adapter.model.ICreditBasic;

public class Main {
    public static void main(String[] args) {

        Adaptor ad1 = new Adaptor("1234");
        ad1.oferaCreditLeasing();

        ICreditBasic credit = new CreditBasic("Client 1");
        credit.oferaCredit();
    }
}
