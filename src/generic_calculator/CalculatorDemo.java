package generic_calculator;

/**
 * Demo main class to use the generic calculator class
 * @author Abdus Sakur
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        // initializing Integer calculator instance
        Calculator<Integer> calculator = new Calculator<>();
        //printing operational values
        System.out.println(calculator.add(5,5));
        System.out.println(calculator.sub(5,10));
        System.out.println(calculator.divide(25,3));
        System.out.println(calculator.multiply(10,100));
        // initializing Number calculator instance
        Calculator<Number> calculatorNumber = new Calculator<>();
        System.out.println(calculator.add(5,5));
        System.out.println(calculator.sub(5,10));
        System.out.println(calculator.divide(25,3));
        System.out.println(calculator.multiply(10,100));
    }
}
