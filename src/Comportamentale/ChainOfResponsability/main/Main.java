package Comportamentale.ChainOfResponsability.main;

import Comportamentale.ChainOfResponsability.model.*;

public class Main {
    public static void main(String[] args) {
        AResponsabil responsabil1 = new ResponsabilSMS();
        AResponsabil responsabil2 = new ResponsabilEmail();
        AResponsabil responsabil3 = new ResponsabilManager();

        responsabil1.setUrmatorulResponsabil(responsabil2);
        responsabil2.setUrmatorulResponsabil(responsabil3);



        //Client client = new Client("Nume1","0283273",null);
       //Client client = new Client("Nume1",null,"@gmail.com");
        Client client = new Client("Nume1",null,null);
        responsabil1.notifica(client,"mesaj1");

    }
}
