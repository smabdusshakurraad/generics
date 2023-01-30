package wildcard;

import java.util.List;

public class Wildcard {
    // using wildcard argument in the method
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    //upper bounded wildcard
    public static void process(List<? extends Number> list){
        // process list of Number/ or any subclass type
    }

    //lower bounded wildcard
    public static void addNumbers(List<? super Integer> list){
        // add number in the list of Integer/Number/Object
    }
}
