package Comportamentale.ChainOfResponsability.model;

public class ResponsabilEmail extends AResponsabil{
    @Override
    public void notifica(Client c, String mesaj) {
        if(c.getMail()!=null){
            System.out.println("Clientul "+c.getNume()+" a fost notificat prin Mail cu mesajul "+mesaj);
        }
        else{
            super.getUrmatorulResponsabil().notifica( c,  mesaj);
        }
    }
}
