package generic_calculator;

/**
 * dynamic calculator to calculate any type of number
 * @author Abdus Sakur
 * @param <T> {@link Number}
 */
public class Calculator<T extends Number> {
    // Method to add 2 number
    public double add(T firstNumber, T secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }
    // Method to subtract 2 number
    public double sub(T firsNumber, T secondNumber) {
        return firsNumber.doubleValue() - secondNumber.doubleValue();
    }
    // Method to multiply 2 number
    public double multiply(T firstNumber, T secondNumber) {
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }
    // Method to divide 2 number
    public double divide(T firsNumber, T secondNumber){
        if(secondNumber.doubleValue() == 0.0){
            throw new ArithmeticException();
        }
        return firsNumber.doubleValue()/secondNumber.doubleValue();
    }
    //Method to get modulus of two number
    public double modulus(T firstNumber, T secondNumber){
        return firstNumber.doubleValue() % secondNumber.doubleValue();
    }
}
