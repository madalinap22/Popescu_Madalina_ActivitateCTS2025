package extra3.I_Decorator2.model;

import java.util.ArrayList;
import java.util.List;

public class SpitalDecorat extends ASpitalDecorator{

    private List<Vizitator> listaVizitatori = new ArrayList<>();

    public SpitalDecorat(ISpital spital, List<Vizitator> listaVizitatori) {
        super(spital);
        this.listaVizitatori = listaVizitatori;
    }


    @Override
    public void accesSalonEchipaj(Vizitator vizitator) {
        listaVizitatori.add(vizitator);
        if(listaVizitatori.size() >= 5){
            System.out.println("Se echipeaza vizitatorii si primesc acces");
        }else{
            System.out.println("Prea putini vizitatori");
        }
    }
}
