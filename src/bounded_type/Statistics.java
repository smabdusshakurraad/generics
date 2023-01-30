package bounded_type;

/**
 * example of type bounding by inheriting number class
 * @author Abdus Sakur
 * @param <T> {@link Number}
 */
public class Statistics <T extends Number>{
    // declaring generic array
    private T[] numbers;
    // constructor to initialize the array
    public Statistics (T[] numbers){
        this.numbers = numbers;
    }
    // method to return average value of the array
    public double average(){
        double sum = 0.0;
        for(T number:numbers){
            sum += number.doubleValue();
        }
        return sum/numbers.length;
    }
}
