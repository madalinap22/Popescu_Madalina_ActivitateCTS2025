package Structurale.extra.SpitalAdapterObiecte.model;

import Structurale.extra.SpitalAdapterObiecte.model.softNou.IReteta;

//soft deja existent
//la adapterul ed obiecte implememtam interfata existenta
public class Adapter implements IMedicament{
    //un obiect de tipul clasei noi
    private IReteta reteta;

    public Adapter(IReteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void descriere() {
        System.out.println(reteta);
        //System.out.println(reteta.toString());
    }

    @Override
    public void achizitioneazaMedicament() {
        //obiecte de tipul reteta cu functii din softul nou
        reteta.printeazaReteta();
    }


}
