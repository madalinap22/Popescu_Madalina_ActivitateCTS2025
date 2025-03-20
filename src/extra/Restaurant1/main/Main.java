package extra.Restaurant1.main;

import extra.Restaurant1.classes.*;

import static FactoryMethod.main.Main.method;

public class Main {

        public static void method (IFactory factory) {
            ISupa s = factory.creeazaSupa();
            s.descriere();
        }
        public static void main (String[]args){

            method(new FactorySupaCiuperci());
            method(new FactorySupaLegume());
            method(new FactorySupaVita());
        }

    }

