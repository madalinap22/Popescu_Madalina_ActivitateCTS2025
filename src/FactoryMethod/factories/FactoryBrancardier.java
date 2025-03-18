package FactoryMethod.factories;

import FactoryMethod.classes.Brancardier;
import FactoryMethod.classes.IPersonalSpital;

public class FactoryBrancardier implements IFactory{
    @Override
    public IPersonalSpital createObject() {
        return new Brancardier();
    }
}
