package SimpleFactory.main;

import SimpleFactory.classes.Factory;
import SimpleFactory.classes.IPersonalSpital;
import SimpleFactory.classes.TipPersonalEnum;

public class Main {
    public static void main(String[] args) throws Exception {

        Factory factory = new Factory();
        IPersonalSpital p1 = factory.createInstance(TipPersonalEnum.Brancardier);
        p1.descriere();
    }
}
