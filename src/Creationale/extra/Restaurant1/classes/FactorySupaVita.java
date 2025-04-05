package Creationale.extra.Restaurant1.classes;

public class FactorySupaVita implements IFactory{
    @Override
    public ISupa creeazaSupa() {
        return new SupaVita();
    }
}
