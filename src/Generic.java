public class Generic<T>{
    //declaring generic type field
    private T obj;

    //Constructor to receive parameterized object
    public Generic(T obj){
        this.obj = obj;
    }
    //accessor method
    public T getObj(){
        return obj;
    }
    // method to see the object type in runtime
    public void showType(){
        System.out.println("Type of T: "+obj.getClass().getName());
    }
}
