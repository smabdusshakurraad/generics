public class GenericStackDemo {
    public static void main(String[] args) {
        GenericStack<String> cities = new GenericStack<>();
        cities.push("Dhaka");
        cities.push("CTG");
        cities.push("Toronto");
        cities.push("Calgary");

        System.out.println(cities.pop());
        cities.printElements();
    }
}
