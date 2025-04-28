package Comportamentale.Observer.main;

import Comportamentale.Observer.model.Agentia;
import Comportamentale.Observer.model.ClientFidel;
import Comportamentale.Observer.model.IObserver;

public class Main {
    public static void main(String[] args) {
        IObserver obs1 = new ClientFidel("Client1");
        IObserver obs2 = new ClientFidel("Client2");
        IObserver obs3 = new ClientFidel("Client3");
        IObserver obs4 = new ClientFidel("Client4");

        Agentia agentie = new Agentia("Agentie1", 40);
        agentie.adaugaObserver(obs1);
        agentie.adaugaObserver(obs2);
        agentie.adaugaObserver(obs3);
        agentie.adaugaObserver(obs4);

        agentie.reducePret();
        agentie.adaugaOferta();
    }
}
