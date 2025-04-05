package Creationale.FactoryMethod.factories;

import Creationale.FactoryMethod.classes.Brancardier;
import Creationale.FactoryMethod.classes.IPersonalSpital;

public class FactoryBrancardier implements IFactory{
    @Override
    public IPersonalSpital createObject() {
        return new Brancardier();
    }
}
