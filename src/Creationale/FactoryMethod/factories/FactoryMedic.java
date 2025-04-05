package Creationale.FactoryMethod.factories;

import Creationale.FactoryMethod.classes.IPersonalSpital;
import Creationale.FactoryMethod.classes.Medic;

public class FactoryMedic implements IFactory{
    @Override
    public IPersonalSpital createObject() {
        return new Medic();
    }
}
