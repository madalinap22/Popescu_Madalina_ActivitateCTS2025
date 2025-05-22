package extra3.I_Decorator2.model;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private List<String> sectii = new ArrayList<>();
    private String nume;

    public Spital(List<String> sectii, String nume) {
        this.sectii = sectii;
        this.nume = nume;
    }

    @Override
    public void accesSalon(Vizitator vizitator) {
        if(vizitator.isAreScrisoare()){
            System.out.println("Acces permis");
        }else{
            System.out.println("Acces nepermis");
        }

    }


}
