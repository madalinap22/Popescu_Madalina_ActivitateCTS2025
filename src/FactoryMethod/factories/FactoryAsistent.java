package FactoryMethod.factories;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.IPersonalSpital;

public class FactoryAsistent implements IFactory{
    @Override
    public IPersonalSpital createObject() {
        return new Asistent();
    }
}
