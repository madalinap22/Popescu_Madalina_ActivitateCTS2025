package extra4.Chain.main;

import extra4.Chain.model.*;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Ioana", 150);
        AResponsabil a1 = new ContResponsabil1(300);
        AResponsabil a2 = new ContResponsabil2(500);
        AResponsabil a3 = new ContResponsabil3(600);

        a1.setUrmatorulResponsabil(a2);
        a2.setUrmatorulResponsabil(a3);
        a1.plateste(c1);
    }
}
