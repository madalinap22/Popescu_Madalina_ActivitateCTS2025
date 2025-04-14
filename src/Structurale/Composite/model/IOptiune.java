package Structurale.Composite.model;

public interface IOptiune {

    void adaugaNod(IOptiune optiune) throws Exception;
    void stergeNod(IOptiune optiune) throws Exception;
    void getNod(int index) throws Exception;
    void descriere();

}
