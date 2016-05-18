import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2016/5/18.
 */
public class Supermarket {
    Cashier[] cashiers = new Cashier[]{new Cashier(), new Cashier(), new Cashier()};
    List<Goods> storage = new ArrayList<>();

    public Supermarket() {
        int store = 15;
        for (int i = 0; i < store; i++) {
            storage.add(new Apple());
            storage.add(new Macbook());
            storage.add(new Cookie());
        }
        System.out.println(storage);
    }
    public Cashier[] getCashier(){
        return cashiers;
    }
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        while (supermarket.storage.size() > 0) {
            Customer customer = new Customer();
            customer.pick(supermarket.storage);
            Cashier[] cashier=supermarket.getCashier();
            cashier[new Random().nextInt(cashier.length)].checkout(customer);
            System.out.println(supermarket.storage);
            System.out.println(cashier[0].getCounter());
            System.out.println(cashier[1].getCounter());
            System.out.println(cashier[2].getCounter());
        }
    }

}
