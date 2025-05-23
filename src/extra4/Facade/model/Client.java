package extra4.Facade.model;

public class Client {
    private int varstaClient;
    private boolean areCazier;
    private boolean areCreante;

    public Client(int varstaClient, boolean areCazier, boolean areCreante) {
        this.varstaClient = varstaClient;
        this.areCazier = areCazier;
        this.areCreante = areCreante;
    }

    public void depunereDosar(){
        System.out.println("Clientul si-a depus dosarul de deschidere cont");
    }

}
