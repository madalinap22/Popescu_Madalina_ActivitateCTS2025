package extra3.I_Proxy.main;

import extra3.I_Proxy.model.AerConditionat;
import extra3.I_Proxy.model.ISistem;
import extra3.I_Proxy.model.Proxy_bun;

public class Main_bun {
    public static void main(String[] args) {

        ISistem sistem1 = new AerConditionat("Model 1", false, false);
        Proxy_bun p1 = new Proxy_bun(sistem1);

        p1.pornesteProgram();
    }

}
