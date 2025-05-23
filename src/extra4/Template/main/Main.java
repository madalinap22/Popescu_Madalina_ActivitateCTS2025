package extra4.Template.main;

import extra4.Template.model.ABancomat;
import extra4.Template.model.InterogareBancomat;
import extra4.Template.model.RetragereBancomat;

public class Main {
    public static void main(String[] args) throws Exception {

        ABancomat b1 = new InterogareBancomat("123");
        b1.operatiuneCard();
        ABancomat b2 = new RetragereBancomat("456");
        b2.operatiuneCard();
    }
}
