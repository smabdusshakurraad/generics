package tuple;

/**
 * @author Abdus Sakur
 */
public class TupleDemo {
    public static void main(String[] args){
        // initializing tuple of String String type
        Tuple<String, String> tuple = new Tuple<>("Abdus","Sakur");
        tuple.showTypes();
        // initializing Tuple of String, Integer type
        Tuple<String, Integer> person = new Tuple<>("Raad",24);
        person.showTypes();
        // initializing tuple of Integer and tuple integer, integer type
        Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple = new Tuple<>("Tuple", new Tuple<>(10,15));
        tupleInsideTuple.showTypes();
        tupleInsideTuple.getY().showTypes();
    }
}
