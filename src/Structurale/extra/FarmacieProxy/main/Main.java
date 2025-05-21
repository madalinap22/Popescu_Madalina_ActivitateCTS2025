package Structurale.extra.FarmacieProxy.main;

import Structurale.extra.FarmacieProxy.model.Client;
import Structurale.extra.FarmacieProxy.model.IMedicament;
import Structurale.extra.FarmacieProxy.model.Medicament;
import Structurale.extra.FarmacieProxy.model.Proxy_new;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Nume1",true);

        //Proxy cu atribut de tip clasa concreta
        Medicament med0 = new Medicament(client1);
        Proxy_new proxyMedicament0 = new Proxy_new(med0);
        proxyMedicament0.achizitioneazaMedicament();

        //Proxy cu atribut de tipul interfetei
        IMedicament med1 = new Medicament(client1);
        Proxy_new proxyMedicament = new Proxy_new(med1);
        proxyMedicament.achizitioneazaMedicament();


    }
}
