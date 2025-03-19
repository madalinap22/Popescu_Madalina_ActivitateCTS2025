package FactoryMethod.main;

import FactoryMethod.classes.IPersonalSpital;
import FactoryMethod.factories.FactoryAsistent;
import FactoryMethod.factories.FactoryMedic;
import FactoryMethod.factories.IFactory;

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
