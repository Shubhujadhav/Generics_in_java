

public class MultipleTypeParameterExample {
    public static <K, V> void printKeyValue( K key, V value){
        System.out.println("Key :"+key +", Value"+value);
    }
    public static void main(String[] args) {
        printKeyValue("name:",   " shubhangi");
        printKeyValue("Age:",  20);
        printKeyValue("Designation:"," BSC");
        printKeyValue("salary:"," jale pe namak mat chidak bhai job nahi hai");
    }    
}
