package extra4.Facade.model;

public class Facade {
    public void creazaContClient(String numeOperator, int varstaClient,
                                 boolean areCazier, boolean areCreante){
        Operator op1 = new Operator(numeOperator);
        Client c1 = new Client(varstaClient,areCazier,areCreante);
        c1.depunereDosar();
        op1.verificaClient();
    }
}
