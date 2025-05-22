package extra3.I_Strategy.main;

import extra3.I_Strategy.model.*;

public class Main {
    public static void main(String[] args) {


        ISistem sistem1 = new Program1();
        ISistem sistem2 = new Program2();
        ISistem sistem3 = new Program3();

        AerConditionat ac1 = new AerConditionat("Model1", sistem1);
        ac1.pornesteProgram();
        ac1.setSistem(sistem2);
        ac1.pornesteProgram();
    }
}
