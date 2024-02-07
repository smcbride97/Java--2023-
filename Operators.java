public class Operators {
    public static void main(String args []){
        //Arithmetic operators
        System.out.println(8+3);
        System.out.println(8-3);
        System.out.println(8*3);
        System.out.println(8/3);
        System.out.println(8%3);
        //System.out.println(8/0);
        System.out.println("Hello" + " world");
        System.out.println("Goodbye" + "World");
        System.out.println("In" + " order" + " to" + " succeed," + " you" + " must" + " apply" + " effort.");
        System.out.println("Hello " + 11);

        //An attempt at an expression (on my own, not in lesson)
        int year = 2023;
        String zodiac = "rabbit";
        System.out.println("It is the year " + year + ". In the east, this is known as the year of the " + zodiac + ".");

        //Assignment operators
        int x = 6;
        System.out.println(x);
        x++; //x = x + 1, x += 1
        System.out.println(x);
        x--; //x = x - 1, x -= 1
        System.out.println(x);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(--x);
        x += 2; //x = x + 2
        System.out.println(x);
        x *= 3; //x = x * 3
        System.out.println(x);

        //Relational operators
        System.out.println(3>6);
        System.out.println(3<6);
        System.out.println(3<=6);
        System.out.println(3>=3);
        System.out.println(3!=6);
        System.out.println("Apple" == "Orange");
        System.out.println('B' > 'A');

        //Logical operators
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println((3>6) || (3<6));
        System.out.println(!(3!=6));
        System.out.println(!!true);
        System.out.println(!!false);

        //Unary operators
        System.out.println(-(6-3));
        System.out.println(!true);

        //Ternary operators
        System.out.println(true ? 1 : 0);
        System.out.println(false ? 1 : 0);

        int a = 6, b = 3;
        System.out.println(a>b ? a:b); //max
        System.out.println(a<b ? a:b); //min

        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
