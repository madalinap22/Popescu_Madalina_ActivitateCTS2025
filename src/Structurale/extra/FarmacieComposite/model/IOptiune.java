package Structurale.extra.FarmacieComposite.model;

public interface IOptiune {
    void adaugaNod(IOptiune opt);
    void stergeNod(IOptiune opt);
    void getNod(int index);
    void descriere();
}
