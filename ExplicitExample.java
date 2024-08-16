public class ExplicitExample {
    public static void main(String[] args) {
        double doubleVal = 100.04;
        float floatVal = (float) doubleVal;
        long longVal = (long) floatVal;
        int intVal = (int)longVal;
        short shortVal = (short)intVal;
        byte byteVal = (byte) shortVal;

        float f = 250.04f;
        byte b = (byte)f;
        int i = 122;
        b = (byte) i;
        System.out.println(b);
    }
    
}
