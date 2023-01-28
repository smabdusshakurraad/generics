package dynamic_array_sub_typing;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        // Dynamic array of integer of length 5
        DynamicArray<Integer> numbers = new DynamicArray<>(5);
        // adding element in the array
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        // printing the array
        System.out.println(numbers);
        // printing the elements
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        // getting the size of the array
        int totalElements = numbers.size();
        // printing the size
        System.out.println("total elements = " + totalElements);
        // Initializing dynamic array of type string with default size
        DynamicArray<String> cities = new DynamicArray<>();
        // adding elements
        cities.add("Dhaka");
        cities.add("Toronto");
        cities.add("New York");
        cities.add("Beijing");
        cities.add("Tokyo");
        cities.add("Sao paulo");
        // printing the array
        System.out.println(cities);
    }
}
