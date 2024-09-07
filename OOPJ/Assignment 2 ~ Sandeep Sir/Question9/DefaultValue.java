package defaultvalue.question9;

public class DefaultValue {

    // Instance variables
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    // Static variables
    static byte staticByteVar;
    static short staticShortVar;
    static int staticIntVar;
    static long staticLongVar;
    static float staticFloatVar;
    static double staticDoubleVar;
    static char staticCharVar;
    static boolean staticBooleanVar;

    public static void main(String[] args) {
        // Create an object of DefaultValues class to check instance variables
        DefaultValue defaultValue = new DefaultValue();

        // Print instance variables (default values)
        System.out.println("Instance Variable Defaults:");
        System.out.println("byte: " + defaultValue.byteVar);
        System.out.println("short: " + defaultValue.shortVar);
        System.out.println("int: " + defaultValue.intVar);
        System.out.println("long: " + defaultValue.longVar);
        System.out.println("float: " + defaultValue.floatVar);
        System.out.println("double: " + defaultValue.doubleVar);
        System.out.println("char: [" + defaultValue.charVar + "]");
        System.out.println("boolean: " + defaultValue.booleanVar);

        // Print static variables (default values)
        System.out.println("\nStatic Variable Defaults:");
        System.out.println("byte: " + staticByteVar);
        System.out.println("short: " + staticShortVar);
        System.out.println("int: " + staticIntVar);
        System.out.println("long: " + staticLongVar);
        System.out.println("float: " + staticFloatVar);
        System.out.println("double: " + staticDoubleVar);
        System.out.println("char: [" + staticCharVar + "]");
        System.out.println("boolean: " + staticBooleanVar);
    }
}
