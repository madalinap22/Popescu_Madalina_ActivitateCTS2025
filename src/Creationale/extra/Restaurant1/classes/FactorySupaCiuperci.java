package Creationale.extra.Restaurant1.classes;

public class FactorySupaCiuperci implements IFactory{

    @Override
    public ISupa creeazaSupa() {
        return new SupaCiuperci();
    }
}
