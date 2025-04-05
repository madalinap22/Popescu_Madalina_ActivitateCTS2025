package Creationale.SimpleFactory.classes;

public class Factory {

   public IPersonalSpital createInstance(TipPersonalEnum tip) throws Exception {
        switch (tip){
            case Brancardier : return new Brancardier();
            case Asistent : return new Asistent();
            case Medic : return new Medic();
            default : throw new Exception("Nu exista acest tip de personal spital");
        }

    }
}
