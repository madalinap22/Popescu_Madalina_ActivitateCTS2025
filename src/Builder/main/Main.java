package Builder.main;

import Builder.classes.IBuilder;
import Builder.classes.PacientBuilder;

//Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia.
// Fiecare pacient are posibilitatea sa plătească extra pentru anumite facilitate precum:
// pat rabatabil, mic dejun inclus, papuci de camera, halat pentru interior. In cazul in
// care pacientul nu alege aceste facilitați extra, in cadrul aplicației sunt setate cu false.
// Să se dezvolte modulul care asigură crearea de obiecte de tipul pacient cu opțiuni extra
public class Main {
    public static void main(String[] args) {

        IBuilder builder = new PacientBuilder(true);

        var p1 = ((PacientBuilder)builder).setArePapuciCamera(true).setAreHalat(true).build();
        System.out.println(p1);

        var p2 = ((PacientBuilder)builder).setAreMicDejunInclus(true).build();
        System.out.println(p2);


    }
}
