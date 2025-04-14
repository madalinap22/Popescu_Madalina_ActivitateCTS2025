package Structurale.Decorator.model;

public abstract class PachetTuristicDecorator implements PachetTuristic{
    protected PachetTuristic pachet;

    public PachetTuristicDecorator(PachetTuristic pachet) {
        this.pachet = pachet;
    }



    @Override
    public void rezervaPachet() {
        this.pachet.rezervaPachet();
    }

    public abstract void anuleazaRezervare();

}
