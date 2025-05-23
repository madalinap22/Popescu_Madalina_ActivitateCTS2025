package extra4.Proxy.model;

public class Proxy implements ICont{
   private ICont cont;

    public Proxy(ICont cont) {
        this.cont = cont;
    }

    @Override
    public void deschidereCont() {
       Credit credit = (Credit) cont;
       if(credit.isEsteRON() == true){
               System.out.println("Contul a fost deschis");
       }else{
           System.out.println("Creditul nu este in RON si contul nu a fost deschis");
       }
    }
}
