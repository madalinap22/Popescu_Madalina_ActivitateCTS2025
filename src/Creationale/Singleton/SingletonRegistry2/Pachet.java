package Creationale.Singleton.SingletonRegistry2;

public class Pachet extends APachet implements ICompanieLivrare{

    private static ICompanieLivrare instanta;


    private Pachet(String nume, String data, int suma) {
        super(nume, data, suma);
    }

    public static synchronized ICompanieLivrare getInstance(String n, String d, int s){
        if(instanta == null) {
            instanta = new Pachet(n, d, s);
        }
        return instanta;
    }

    @Override
    public void preluarePachet(APachet pachet) {
        System.out.println("Pachetul pentru "+pachet.nume+
                " din data de "+pachet.data+
                " cu valoarea de "+pachet.suma);

    }
}
