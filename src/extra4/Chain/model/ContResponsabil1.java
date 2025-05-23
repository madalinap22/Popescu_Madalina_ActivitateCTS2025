package extra4.Chain.model;

public class ContResponsabil1 extends AResponsabil{

    public ContResponsabil1(float sumaCurenta) {
        super(sumaCurenta);
    }

    @Override
    public void plateste(Client c) {
        if(c.getSumaRetras() <= this.sumaCurenta){
            System.out.println("S-a retras suma din contul 1");
        }else{
            super.getUrmatorulResponsabil().plateste(c);

        }
    }

}
