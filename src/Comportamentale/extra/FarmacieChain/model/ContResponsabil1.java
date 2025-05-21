package Comportamentale.extra.FarmacieChain.model;

public class ContResponsabil1 extends AContResponsabil{


    public ContResponsabil1(float sumaCurenta) {
        super(sumaCurenta);
    }

    @Override
    public void plateste(Client c) {
        if(c.getsumaDePlata() <= this.sumaCurenta){
            System.out.println("Plata a fost realizata din contul 1");
        } else {
           super.getUrmatorulResponsabil().plateste(c);
        }
    }
}
