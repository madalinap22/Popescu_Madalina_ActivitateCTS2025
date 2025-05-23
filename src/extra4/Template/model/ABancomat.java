package extra4.Template.model;

public abstract class ABancomat {
    protected String serieCard;
    public ABancomat(String serieCard) {
        this.serieCard = serieCard;
    }

    public abstract void introduceCard(String serie);
    public abstract void introducePin(String serie);
    public abstract void specificaSuma(String serie);
    public abstract void retragereSuma(String serie);
    public abstract void retragereCard(String serie);

    public final void operatiuneCard() {
        introduceCard(this.serieCard);
        introducePin(this.serieCard);
        specificaSuma(this.serieCard);
        retragereSuma(this.serieCard);
        retragereCard(this.serieCard);
    }


}
