package Structurale.Facade.model;

public class Facade {
    public void rezervaPachet(){
        Hotel hotel = new Hotel("Patria", 200, true);
        hotel.rezervaCamera();
        Zbor zbor = new Zbor(1,"Lisabona");
        zbor.rezervaZbor();
        Masina masina = new Masina("audi", 200);
        masina.inchiriazaMasina();

    }

}
