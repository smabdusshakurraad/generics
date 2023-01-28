package tuple;

/**
 *  Generic tuple to get multiple generic types
 * @param <X>
 * @param <Y>
 * @author Abdus Sakur
 */
public class Tuple<X,Y> {
    //declaring generic type field
    private final X x;
    private final Y y;
    // parameterized constructor
    public Tuple(X x, Y y){
        this.x = x;
        this.y = y;
    }
    // accessor methods
    public X getX() {
        return x;
    }
    public Y getY(){
        return y;
    }
    // method for printing generic type
    public void showTypes(){
        System.out.println("Type of X is " + x.getClass().getName() + " and value: " + x);
        System.out.println("Type of Y is " + y.getClass().getName() + " and value: " + y);
    }
}
