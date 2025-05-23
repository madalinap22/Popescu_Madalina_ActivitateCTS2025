package extra4.Chain.model;

public class ContResponsabil3 extends AResponsabil{
    public ContResponsabil3(float sumaCurenta) {
        super(sumaCurenta);
    }

    @Override
    public void plateste(Client c) {
        if(c.getSumaRetras() <= this.sumaCurenta){
            System.out.println("S-a retras suma din contul 3");
        }else{
            System.out.println("Plata a fost refuzata");

        }
    }
}
