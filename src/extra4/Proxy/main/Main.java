package extra4.Proxy.main;

import extra4.Chain.model.Client;
import extra4.Proxy.model.Credit;
import extra4.Proxy.model.ICont;
import extra4.Proxy.model.Proxy;

public class Main {
    public static void main(String[] args) {

        ICont c1 = new Credit(false);
        Proxy proxy = new Proxy(c1);
        proxy.deschidereCont();
    }
}
