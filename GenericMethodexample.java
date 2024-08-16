class Test<T> {
    // Removed redundant <T> in the method signature
    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class GenericMethodexample {
  public static void main(String[] args) {
        Test<String> striTest = new Test<>();
        String[] arr = {"shubhangi", "Nandini", "pawan", "vaibhav", "raju"};
        
        Test<Integer> inTest = new Test<>();
        Integer[] intArr = {12, 15, 39, 3}; // Fixed formatting of integers (03 to 3)
        inTest.printArray(intArr);
        
        striTest.printArray(arr);
        
        // Create an instance of Test for Object type
        Test<Object> objecTest = new Test<>();
        Object[] objectArray = {"hello", 20, 30.5, 40.5f, "ramesh"};
        objecTest.printArray(objectArray); // Fixed method name to printArray
    }
}
