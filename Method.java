import java.util.Arrays;

public class Method {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);

        change(a);
        System.out.println(a);
        System.out.println(change2(a));

        String s = "Hello";
        System.out.println(s);
        change(s);
        System.out.println(s);

        int b[] = {1};
        System.out.println(b[0]);
        change(b);
        System.out.println(b[0]);

        int numbers[] = {1, 2, 3, 4, 5, 6};
        System.out.println(average(numbers));
    }

    // Function call by value for primtive data types
    // Make a copy of the input parameter
    public static void change(int a) {
        a = 30;
        System.out.println("Inside function: " + a);
    }

    public static int change2(int a) {
        a = 30;
        return a;
    }

    public static void change(String s) {
        s = "Hello world";
    }

    // Function call by reference for compound data types
    // The reference points to the original variable
    // Method overloading: same method name, different input
    public static void change(int[] b) {
        b[0] = 30;
    }

    private static double average(int[] numbers) {
        int sum = 0;
        for(int number : numbers) 
            sum += number;
        return (double) sum/numbers.length;   
    }
}
