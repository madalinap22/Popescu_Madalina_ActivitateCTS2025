package extra3.I_Strategy.model;

public class Program1 implements ISistem{
    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void pornesteProgram() {
        System.out.println("Programul 1 fost pornit");
    }

    @Override
    public void seteazaProgram() {
        System.out.println("Programul 1 a fost setat");
    }

    @Override
    public void finalizareProgram() {
        System.out.println("Programul 1 a fost finalizat");
    }
}
