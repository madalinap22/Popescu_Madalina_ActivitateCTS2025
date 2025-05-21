package Comportamentale.extra.FarmacieChain.model;

public class ContResponsabil3 extends AContResponsabil{
    public ContResponsabil3(float sumaCurenta) {
        super(sumaCurenta);
    }

    @Override
    public void plateste(Client c) {
        if(c.getsumaDePlata() <= this.sumaCurenta){
            System.out.println("Plata a fost realizata din contul 3");
        } else {
            System.out.println("Plata a fost refuzata");
        }
    }
}
