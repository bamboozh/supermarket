import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2016/5/18.
 */
public class Customer {
  private  List<Goods> cart=new ArrayList<>();
        void  pick(List<Goods> storage){
          int i=new Random().nextInt(storage.size());
            cart.add(storage.remove(i));
        }
    public List<Goods> getCart(){
        return cart;
    }



}
