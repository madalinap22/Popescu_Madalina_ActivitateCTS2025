package Creationale.SimpleFactory.main;

import Creationale.SimpleFactory.classes.Factory;
import Creationale.SimpleFactory.classes.IPersonalSpital;
import Creationale.SimpleFactory.classes.TipPersonalEnum;

public class Main {
    public static void main(String[] args) throws Exception {

        Factory factory = new Factory();
        IPersonalSpital p1 = factory.createInstance(TipPersonalEnum.Brancardier);
        p1.descriere();
    }
}
