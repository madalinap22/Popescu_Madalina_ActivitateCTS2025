package Structurale.extra.FarmacieComposite.main;

import Structurale.extra.FarmacieComposite.model.IOptiune;
import Structurale.extra.FarmacieComposite.model.Item;
import Structurale.extra.FarmacieComposite.model.Sectiune;
//Dirigintele farmaciei dorește organizarea medicamentelor într-o structura arborescenta
//        pentru o căutare facila a acestora de către farmaciști.
//        Astfel medicamentele vor fi organizate in cadrul aplicației pe secțiuni
//        (Răceala, Durere, Antibiotice, etc) Fiecare secțiune conține subsecțiuni
//        (Adulți, Copii, etc) sau medicamentele din acea categorie.
//        Sa se realizeze modulul care permite reprezentarea arborescenta a medicamentelor
//        in cadrul aplicației.


public class Main {
    public static void main(String[] args) {

        IOptiune sectiune1 = new Sectiune("Raceala");
        IOptiune sectiune2 = new Sectiune("Durere");
        IOptiune sectiune3 = new Sectiune("Antibiotice");

        IOptiune subSectiune1 = new Sectiune("Adulti");
        IOptiune subSectiune2 = new Sectiune("Copii");

        IOptiune item1 = new Item("Paracetamol");
        IOptiune item2 = new Item("Paracetamol Kids");
        IOptiune item3 = new Item("Analgezic");
        IOptiune item4 = new Item("Sirop tuse kids");
        IOptiune item5 = new Item("Antibiotic1");

        //adaugare frunza->
        sectiune1.adaugaNod(subSectiune1);
        subSectiune1.adaugaNod(item1);
        //sectiune1.descriere();

        sectiune1.adaugaNod(subSectiune2);
        subSectiune2.adaugaNod(item2);
        subSectiune2.adaugaNod(item4);
        sectiune1.descriere();




    }
}
