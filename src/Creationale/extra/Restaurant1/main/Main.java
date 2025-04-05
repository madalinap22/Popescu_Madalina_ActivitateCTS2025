package Creationale.extra.Restaurant1.main;

import Creationale.extra.Restaurant1.classes.*;

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

