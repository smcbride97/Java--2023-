public class WrapperClass{
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0f;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        //Autoboxing: Converting primitives into objects
        Byte byteobj = b;
        Short shortobj = s;
        Integer intobj = 1;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;

        //Printing objects
        System.out.println("---Printing object values---");
        System.out.println("Byte object: " + byteobj);
        System.out.println("Short object: " + intobj);
        System.out.println("Long object: " + longobj);
        System.out.println("float object: " + floatobj);
        System.out.println("Double object: " + doubleobj);
        System.out.println("Character object: " + charobj);
        System.out.println("Boolean object: " + boolobj);

        //Unboxing: Converting Objects to Primitves
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean boolvalue = boolobj;

        //Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("Byte object: " + byteobj);
        System.out.println("Short object: " + intobj);
        System.out.println("Long object: " + longobj);
        System.out.println("float object: " + floatobj);
        System.out.println("Double object: " + doubleobj);
        System.out.println("Character object: " + charobj);
        System.out.println("Boolean object: " + boolobj);

        Integer x = 3; //autoboxing
        int y = x; //unboxing
        System.out.println(x);
        System.out.println(x.getClass());
        System.out.println(y);
        //System.out.println(y.getClass());
    }
}
