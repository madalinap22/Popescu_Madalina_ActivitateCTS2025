package Structurale.extra.AgentieAdapterObiecte.model;

public class Adapter implements IPachetTuristic{
    private MasinaInchiriata masinaInchiriata;

    public Adapter( MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }


    @Override
    public void descriere() {
        masinaInchiriata.masinaInchiriata();
    }
}
