package Structurale.extra.Composite.model;

public interface IOptiune {
    void adaugaNod(IOptiune opt) throws Exception;
    void stergeNod(IOptiune opt) throws Exception;
    void getNod(int index) throws Exception;
    void descriere();

}
