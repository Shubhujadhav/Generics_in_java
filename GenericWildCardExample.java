import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Test{
    public void printList(List<?>list){
        for (Object element: list){
            System.out.println(element+ " ");
        }
    }
}

public class GenericWildCardExample {

    public static void main(String[] args) {
        Test test = new Test();
        List<String> stringlist = new ArrayList<>(Arrays.asList("hello", "suman","how are you"));
        test.printList(stringlist);
        System.out.println();
        List<Integer> integerlist = new ArrayList<>(Arrays.asList(12, 15, 20,54));
        test.printList(integerlist);
        
    }
}