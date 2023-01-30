import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.StringJoiner;

public class GenericStack <T>{
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int size;

    public GenericStack(){
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(T item){
        if(isFull()){
            grow();
        }
        elements[size] = item;
        size++;
    }

    private void grow() {
        elements = Arrays.copyOf(elements,elements.length*2);
    }

    private boolean isFull() {
        return size == elements.length;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        --size;
        return elements[size];
    }

    private boolean isEmpty() {
        return size == 0;
    }
    public int size(){
        return size;
    }

    public void printElements(){
        StringJoiner stringJoiner = new StringJoiner(", ","[","]");
        for(int i = 0;i<size;i++){
            stringJoiner.add(elements[i].toString());
        }
        System.out.println(stringJoiner);
    }
}
