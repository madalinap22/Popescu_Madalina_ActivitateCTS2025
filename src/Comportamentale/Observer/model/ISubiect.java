package Comportamentale.Observer.model;

//Agentia
public interface ISubiect {
    void adaugaObserver(IObserver obs);
    void stergeObserver(IObserver obs);
    void trimiteNotificare(String mesaj);
}
