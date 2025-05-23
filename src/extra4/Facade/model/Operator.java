package extra4.Facade.model;

public class Operator {
    private String numeOperator;

    public Operator(String numeOperator) {
        this.numeOperator = numeOperator;
    }

    public void verificaClient(){
        System.out.println("Operatorul a verificat clientul");
    }

}
