package extra.Restaurant1.classes;

public class FactorySupaLegume implements IFactory {
    @Override
    public ISupa creeazaSupa() {
        return new SupaLegume();
    }
}
