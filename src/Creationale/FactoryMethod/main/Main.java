package Creationale.FactoryMethod.main;

import Creationale.FactoryMethod.classes.IPersonalSpital;
import Creationale.FactoryMethod.factories.FactoryAsistent;
import Creationale.FactoryMethod.factories.FactoryMedic;
import Creationale.FactoryMethod.factories.IFactory;

public class Main {

    public static void method (IFactory factory){
        IPersonalSpital p = factory.createObject();
        p.descriere();
    }

    public static void main(String[] args) {
        FactoryAsistent a1 = new FactoryAsistent();
        method(a1);

        FactoryMedic m1 = new FactoryMedic();
        method(m1);
    }
}
