package Structurale.Decorator.model;

public abstract class APachetTuristicDecorator implements IPachetTuristic {
    protected IPachetTuristic pachet;

    public APachetTuristicDecorator(IPachetTuristic pachet) {
        this.pachet = pachet;
    }
    @Override
    public void rezervaPachet() {
        this.pachet.rezervaPachet();
    }

    public abstract void anuleazaRezervare();

}
