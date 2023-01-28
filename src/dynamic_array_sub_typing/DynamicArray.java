package dynamic_array_sub_typing;

import java.util.Arrays;
import java.util.StringJoiner;
/**
 * Generic dynamic array
 * @author Abdus Sakur
 */
public class DynamicArray<T>{
    //default capacity of the array
    private static final int DEFAUL_CAPACITY = 10;
    // array of given type
    private T[] elements;
    // declaring current size of the array
    private int size;
    // default constructor
    public DynamicArray(){
        elements = (T[]) new Object[DEFAUL_CAPACITY];
    }
    // parameterize constructor
    public DynamicArray(int length){
        elements = (T[]) new Object[length];
    }
    // method to get the current size of the array
    public int size(){
        return size;
    }
    // method to check if the array is empty or not
    public boolean isEmpty(){
        return size == 0;
    }
    // method to add element in the array
    public void add(T obj){
        if(size == elements.length){
            grow();
        }
        elements[size] = obj;
        size++;
    }
    // method to grow the size of the array
    public void grow(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements,newCapacity);
    }
    // method to get a element of specific index from the array
    public T get(int i){
        if(i<0 || i>= size){
            throw new IndexOutOfBoundsException();
        }
        return elements[i];
    }
    // method to print the dynamic array
    public String toString(){
        StringJoiner joiner = new StringJoiner(", ");
        for(int i =0;i<size;i++){
            joiner.add(String.valueOf(elements[i]));
        }
        return joiner.toString();
    }
}
