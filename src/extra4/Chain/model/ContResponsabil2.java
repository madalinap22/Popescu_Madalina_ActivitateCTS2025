package extra4.Chain.model;

public class ContResponsabil2 extends AResponsabil{
    public ContResponsabil2(float sumaCurenta) {
        super(sumaCurenta);
    }

    @Override
    public void plateste(Client c) {
        if(c.getSumaRetras() <= this.sumaCurenta){
            System.out.println("S-a retras suma din contul 2");
        }else{
            super.getUrmatorulResponsabil().plateste(c);

        }
    }
}
