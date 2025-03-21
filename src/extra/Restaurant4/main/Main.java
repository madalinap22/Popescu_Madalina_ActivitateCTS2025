package extra.Restaurant4.main;
import extra.Restaurant4.classes.ContClient;
import extra.Restaurant4.classes.IContClient;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> rez = new ArrayList<>();
        rez.add("masa 1");
        rez.add("masa 2");

        IContClient client1 = new ContClient("Alexandru","07652347",rez);
        IContClient client2 = client1.clone();

        System.out.println(client1);
        System.out.println(client2);

    }
}
