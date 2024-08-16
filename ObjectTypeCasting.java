public class ObjectTypeCasting {

    public static void main(String[] args) {
        Object obj = 10;
        //when we write Obj= obj +10 ;  this is not allow because this is bad operand types for 
        // bianary operator '+'
        Integer i = (int)obj;
        System.out.println("at line 8: "+i);
        i = i+10;
        System.out.println("at lime 10: "+i);
    }
    
}
