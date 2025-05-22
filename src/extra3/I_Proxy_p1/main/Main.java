package extra3.I_Proxy_p1.main;

import extra3.I_Proxy_p1.model.ISistemAlarma;
import extra3.I_Proxy_p1.model.Proxy;
import extra3.I_Proxy_p1.model.SistemAlarma;

public class Main {
    public static void main(String[] args) {
        ISistemAlarma sistemAlarma = new SistemAlarma("Locatie1", false);
        Proxy p1 = new Proxy(sistemAlarma);
        p1.pornesteAlarma();
    }
}
