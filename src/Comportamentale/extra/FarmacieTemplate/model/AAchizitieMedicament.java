package Comportamentale.extra.FarmacieTemplate.model;

public abstract class AAchizitieMedicament {
    protected String numeMedicament;

    public AAchizitieMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public abstract void scaneazaReteta(String numeMedicament);
    public abstract void verificaStoc(String numeMedicament);
    public abstract void incaseazaBani(String numeMedicament);
    public abstract void scadeStoc(String numeMedicament);
    public abstract void emiteBon(String numeMedicament);
    public abstract void refuzAchizitie(String numeMedicament);

    public final void achizitioneazaMedicament(){
        scaneazaReteta(this.numeMedicament);
        verificaStoc(this.numeMedicament);
        incaseazaBani(this.numeMedicament);
        scadeStoc(this.numeMedicament);
        emiteBon(this.numeMedicament);
        refuzAchizitie(this.numeMedicament);
    }


}
