package extra3.I_Proxy_p1.model;

import extra3.I_Proxy_p1.model.ISistemAlarma;

public class SistemAlarma implements ISistemAlarma {
    private String locatie;
    private boolean sistemActiv;


    public SistemAlarma(String locatie, boolean sistemActiv) {
        this.locatie = locatie;
        this.sistemActiv = sistemActiv;
    }

    public boolean isSistemActiv() {
        return sistemActiv;
    }

    @Override
    public void pornesteAlarma() {
        System.out.println("Sistemul de alarma a pornit");
    }

    @Override
    public boolean detecteazaMiscare() {
        if(this.sistemActiv){
            return true;
        }else{
            return false;
        }
    }
}
