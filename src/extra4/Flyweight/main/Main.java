package extra4.Flyweight.main;

import extra4.Flyweight.model.Cont;
import extra4.Flyweight.model.Fabrica;
import extra4.Flyweight.model.ICont;
import extra4.Flyweight.model.Optional;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();
        Optional optional = new Optional("Banca optional", "Sucursala Optionala", "1234 cont optional");
        ICont cont = new Cont(1,"Nume Client Permanent","07576235");
        cont.afiseazaDateClientDescriere(optional);
    }
}
