package Structurale.extra.RestaurantComposite.main;

import Structurale.extra.RestaurantComposite.model.IOptiune;
import Structurale.extra.RestaurantComposite.model.Item;
import Structurale.extra.RestaurantComposite.model.Sectiune;

//Este dorita reprezentarea meniului in cadrul aplicației.
// Meniul conține secțiuni (startere, băuturi, desert, etc.) fiecare secțiune poate
// conține subsecțiuni (sucuri, cafea, etc) sau item-uri (, apa plata, apa minerala, etc).
// Sa se realizeze modulul care permite reprezentarea arborescenta a meniului restaurantului.
public class Main {
    public static void main(String[] args) throws Exception {
        //Bauturi ->Sucuri ->cola, fanta, etc
        //Bauturi->Apa -> apa plata, minerala
        //Bauturi->Cafea->espresso
        //Desert -> tiramisu, amandina, etc

        IOptiune sectiune1 = new Sectiune("Bauturi");
        IOptiune sectiune2 = new Sectiune("Desert");


        IOptiune subsectiune1 = new Sectiune("Sucuri");
        IOptiune subsectiune2 = new Sectiune("Apa");
        IOptiune subsectiune3 = new Sectiune("Cafea");

        IOptiune item1 = new Item("Cola");
        IOptiune item2 = new Item("Fanta");
        IOptiune item3 = new Item("Apa plata");
        IOptiune item4 = new Item("Espresso");
        IOptiune item5 = new Item("Tiramisu");
        IOptiune item6 = new Item("Amandina");

        //adaugarea se face de jos in sus
        sectiune2.adaugaNod(item6);
        sectiune2.adaugaNod(item5);

        sectiune1.adaugaNod(subsectiune3);
        sectiune1.adaugaNod(subsectiune2);
        sectiune1.adaugaNod(subsectiune1);

        subsectiune1.adaugaNod(item2);
        subsectiune1.adaugaNod(item1);
        subsectiune2.adaugaNod(item3);
        subsectiune3.adaugaNod(item4);


        sectiune1.descriere();
    }
}
