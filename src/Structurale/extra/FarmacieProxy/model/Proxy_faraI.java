package Structurale.extra.FarmacieProxy.model;

public class Proxy_faraI implements IMedicament{
    private Medicament medicament;

    public Proxy_faraI(Medicament medicament) {
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
      if(medicament.getClient().isAreReteta()){
          medicament.achizitioneazaMedicament();
      }else{
          System.out.println("Clientul nu are reteta!");
      }
    }
}
