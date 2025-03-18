package FactoryMethod.factories;

import FactoryMethod.classes.IPersonalSpital;
import FactoryMethod.classes.Medic;

public class FactoryMedic implements IFactory{
    @Override
    public IPersonalSpital createObject() {
        return new Medic();
    }
}
