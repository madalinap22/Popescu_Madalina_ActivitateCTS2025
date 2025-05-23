package extra3.PachetAdapterClase.main;

import extra3.PachetAdapterClase.model.AdapterPachetSiMasina;
import extra3.PachetAdapterClase.model.IPachetTuristic;
import extra3.PachetAdapterClase.model.PachetTuristic;

public class Main {
    public static void main(String[] args) {


        IPachetTuristic pachet1 = new PachetTuristic("Lisabona");
        pachet1.rezervaPachet();

        AdapterPachetSiMasina ad1 = new AdapterPachetSiMasina("Audi");
        ad1.rezervaPachet();


    }
}
