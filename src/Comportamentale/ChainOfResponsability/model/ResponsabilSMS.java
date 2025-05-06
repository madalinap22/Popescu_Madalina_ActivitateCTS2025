package Comportamentale.ChainOfResponsability.model;

public class ResponsabilSMS extends AResponsabil {
    @Override
    public void notifica(Client c, String mesaj) {
        if(c.getNrTelefon()!=null){
            System.out.println("Clientul "+c.getNume()+" a fost notificat prin SMS cu mesajul "+mesaj);
        }
        else{
            super.getUrmatorulResponsabil().notifica( c,  mesaj);
        }
    }
}
