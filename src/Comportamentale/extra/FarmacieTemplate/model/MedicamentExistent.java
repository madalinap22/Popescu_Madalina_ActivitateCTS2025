package Comportamentale.extra.FarmacieTemplate.model;

public class MedicamentExistent extends AAchizitieMedicament{
    public MedicamentExistent(String numeMedicament) {
        super(numeMedicament);
    }

    @Override
    public void scaneazaReteta(String numeMedicament) {
        System.out.println("S-a scanat reteta pentru medicamentul: "+ numeMedicament);
    }

    @Override
    public void verificaStoc(String numeMedicament) {
        System.out.println("S-a verificat stocul pentru medicamentul: "+ numeMedicament);
    }

    @Override
    public void incaseazaBani(String numeMedicament) {
        System.out.println("S-au incasat banii pentru medicamentul: "+ numeMedicament);
    }

    @Override
    public void scadeStoc(String numeMedicament) {
        System.out.println("S-a scazut stocul pentru medicamentul: "+ numeMedicament);
    }

    @Override
    public void emiteBon(String numeMedicament) {
        System.out.println("S-a emis bon pentru medicamentul: "+ numeMedicament);
    }

    @Override
    public void refuzAchizitie(String numeMedicament) {

    }
}
