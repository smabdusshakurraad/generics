public class Main {
    public static void main(String[] args) {
        //Declaring an integer type reference
        Generic<Integer> iObj;
        // creating obj using constructor argument with value 88
        iObj = new Generic<>(88);
        // show the type of the obj
        iObj.showType();
        // accessing the value of the obj
        int value = iObj.getObj();
        // print the value
        System.out.println("value = " + value);

        Generic<String> strObj = new Generic<>("This is a test");
        strObj.showType();
        String strValue = strObj.getObj();
        System.out.println("strValue = " + strValue);
    }
}