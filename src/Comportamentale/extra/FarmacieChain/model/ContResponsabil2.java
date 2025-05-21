package Comportamentale.extra.FarmacieChain.model;

public class ContResponsabil2 extends AContResponsabil{
    public ContResponsabil2(float sumaCurenta) {
        super(sumaCurenta);
    }

    @Override
    public void plateste(Client c) {
        if(c.getsumaDePlata() <= this.sumaCurenta){
            System.out.println("Plata a fost realizata din contul 2");
        } else {
            super.getUrmatorulResponsabil().plateste(c);
        }
    }
}
