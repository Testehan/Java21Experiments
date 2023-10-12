import java.util.ArrayList;
import java.util.List;

public class App {

    void main(){
        System.out.println("hi");

        List list = List.of(1,2,3,4,5,6,7,8);
        List reversed = new ArrayList(list.reversed()); // had to create an arraylist cause List.of returns unmodifiable list
        System.out.println(reversed);

        reversed.addFirst(9);
        reversed.addLast(0);
        System.out.println(reversed);
    }
}
