package Comportamentale.Command.model;

public class Operator {

    public void invoca(IComanda com){
        com.executa();
    }
}
