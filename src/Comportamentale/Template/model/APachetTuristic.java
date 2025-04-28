package Comportamentale.Template.model;

public abstract class APachetTuristic {
    protected int cod;

    public APachetTuristic(int cod) {
        this.cod = cod;
    }

    //nu conteaza ordinea in care definim metodele, ci in metoda finala
    public abstract void cautaCazare(int cod);
    public abstract void cautaTransport(int cod);

    public abstract void rezervaPachet(int cod);
    public abstract void plateste(int cod);

    public final void vindePachet(){
        cautaCazare(this.cod);
        cautaTransport(this.cod);
        rezervaPachet(this.cod);
        plateste(this.cod);
    }
}
