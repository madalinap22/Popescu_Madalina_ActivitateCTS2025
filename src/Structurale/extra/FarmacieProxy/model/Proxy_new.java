package Structurale.extra.FarmacieProxy.model;

public class Proxy_new implements IMedicament{
    private IMedicament medicament;


    public Proxy_new(IMedicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Proxy{");
        sb.append("medicament=").append(medicament);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        medicament.descriere();
    }

    @Override
    public void achizitioneazaMedicament() {
        Medicament medReal = (Medicament) medicament;
        if(medReal.getClient().isAreReteta() == true){
            medReal.achizitioneazaMedicament();
        }else{
            System.out.println("Clientul nu are reteta");
        }
    }
}
