package extra3.PachetAdapterClase.model;

import extra3.PachetAdapterClase.model.softNOU.AMasina;
import extra3.PachetAdapterClase.model.softNOU.MasinaInchiriata;

//extinde clasa concreta din softul nou si interfata din softul existent
public class AdapterPachetSiMasina extends MasinaInchiriata implements IPachetTuristic {


    public AdapterPachetSiMasina(String modelMasina) {
        super(modelMasina);
    }

    @Override
    public void descrierePachet() {
        System.out.println("S-a cumparat pachtul din adapter");
    }

    //apelare metoda din softul nou in interiorul metodei existente
    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }

}
