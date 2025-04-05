package Creationale.FactoryMethod.factories;

import Creationale.FactoryMethod.classes.Asistent;
import Creationale.FactoryMethod.classes.IPersonalSpital;

public class FactoryAsistent implements IFactory{
    @Override
    public IPersonalSpital createObject() {
        return new Asistent();
    }
}
