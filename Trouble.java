package src;

/**
 * Created by 王晨宇1 on 2016/11/3.
 */
import java.util.List;
import java.util.ArrayList;
public class Trouble {
    public static void main(String[] args) {
        List<String> me = new ArrayList<String>();
        me.add("15");
        me.add("16");
        me.add("17");
        me.add("18");
        for (int a = 0; a < me.size(); a++) {
            String b = me.get(a);
            System.out.println(b);
        }
    }
}
