package Comportamentale.extra.FarmacieTemplate.model;

public class MedicamentInexistent extends AAchizitieMedicament{

    public MedicamentInexistent(String numeMedicament) {
        super(numeMedicament);
    }

    @Override
    public void scaneazaReteta(String numeMedicament) {
        System.out.println("S-a scanat reteta pentru medicamentul: "+ numeMedicament);
    }


    @Override
    public void verificaStoc(String numeMedicament) {
        System.out.println("S-a verificat stoc pentru medicamentul: "+ numeMedicament);
    }

    @Override
    public void incaseazaBani(String numeMedicament) {

    }

    @Override
    public void scadeStoc(String numeMedicament) {

    }

    @Override
    public void emiteBon(String numeMedicament) {

    }

    @Override
    public void refuzAchizitie(String numeMedicament) {
        System.out.println("S-a refuzat achizitia pentru medicamentul: "+ numeMedicament);
    }
}
