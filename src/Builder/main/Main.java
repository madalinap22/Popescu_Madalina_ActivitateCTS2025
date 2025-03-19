package Builder.main;

import Builder.classes.IBuilder;
import Builder.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {

        IBuilder builder = new PacientBuilder(true);

        var p1 = ((PacientBuilder)builder).setArePapuciCamera(true).build();
        System.out.println(p1);

        var p2 = ((PacientBuilder)builder).setAreMicDejunInclus(true).build();
        System.out.println(p2);


    }
}
