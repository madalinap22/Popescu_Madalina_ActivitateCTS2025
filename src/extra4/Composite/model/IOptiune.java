package extra4.Composite.model;

public interface IOptiune {
    void metodaSpecificaAfiseaza();
    void adaugaNod(IOptiune opt);
    void stergeNod(IOptiune opt);
    void getNod(int index);

}
