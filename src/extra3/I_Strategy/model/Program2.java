package extra3.I_Strategy.model;

public class Program2 implements ISistem{
    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void pornesteProgram() {
        System.out.println("Programul 2 fost pornit");
    }

    @Override
    public void seteazaProgram() {
        System.out.println("Programul 2 a fost setat");
    }

    @Override
    public void finalizareProgram() {
        System.out.println("Programul 2 a fost finalizat");
    }
}
