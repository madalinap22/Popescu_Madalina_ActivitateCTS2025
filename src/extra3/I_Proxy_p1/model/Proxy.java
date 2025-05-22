package extra3.I_Proxy_p1.model;

import extra3.I_Proxy_p1.model.ISistemAlarma;

public class Proxy implements ISistemAlarma {

    private ISistemAlarma sistemAlarma;

    public Proxy(ISistemAlarma sistemAlarma) {
        this.sistemAlarma = sistemAlarma;
    }

    @Override
    public void pornesteAlarma() {
       if(sistemAlarma.detecteazaMiscare()){
           System.out.println("A pornit alarma");
       }else{
           System.out.println("Nu a pornit alarma.");
       }
    }

    @Override
    public boolean detecteazaMiscare() {
     return sistemAlarma.detecteazaMiscare();
    }
}
