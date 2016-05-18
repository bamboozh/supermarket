import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/18.
 */
public class Cashier {
    private int counter=0;
    List<Goods> sold=new ArrayList<>();
 private void   increase(){
     counter++;
    }
public int getCounter(){
    return counter;
}
    public void checkout(Customer customer){
        sold.addAll(customer.getCart());
        increase();
    }
}
