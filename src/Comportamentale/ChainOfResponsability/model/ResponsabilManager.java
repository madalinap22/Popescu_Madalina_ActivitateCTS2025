package Comportamentale.ChainOfResponsability.model;

public class ResponsabilManager extends AResponsabil{
    @Override
    public void notifica(Client c, String mesaj) {
        System.out.println("Am notificat managerul ca  "+c.getNume()+" nu are date in sistem");
    }
}
