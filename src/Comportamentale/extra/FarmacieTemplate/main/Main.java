package Comportamentale.extra.FarmacieTemplate.main;
//Achiziția de medicamente in Farmacie se face după o procedura bine stabilita
// care conține următorii pași: Se primește rețeta, se verifică în sistem stocul
// medicamentelor cerute, daca stocul este suficient se merge in depozit si se aduc medicamentele,
// daca stocul nu este suficient nu se face achiziția, se aduc medicamentele, se încasează banii,
// se scade din stoc si se emite bonul.


import Comportamentale.extra.FarmacieTemplate.model.AAchizitieMedicament;
import Comportamentale.extra.FarmacieTemplate.model.MedicamentExistent;
import Comportamentale.extra.FarmacieTemplate.model.MedicamentInexistent;

public class Main {
    public static void main(String[] args) {
        AAchizitieMedicament medicament1 = new MedicamentExistent("Paracetamol");
        AAchizitieMedicament medicament2 = new MedicamentInexistent("Panadol");

        medicament1.achizitioneazaMedicament();

        System.out.println("Verificare medicament din clasa MedicamentInexistent: ");
        medicament2.achizitioneazaMedicament();



    }
}
