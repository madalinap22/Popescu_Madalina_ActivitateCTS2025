package extra3.SpitalFacadeNew.model;

public class Pacient2 {
    private String numePacient;
    private int gravitateStare;

    public Pacient2(String numePacient, int gravitateStare) {
        this.numePacient = numePacient;
        this.gravitateStare = gravitateStare;
    }

    public void verificaGravitateStare(){
        System.out.println("S-a verificat starea pacientului cu numele "
                + numePacient + " si are starea " + gravitateStare);
    }

}
