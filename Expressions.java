public class Expressions {
    public static void main(String args[]) {

        //Expression values (slide 16) (solo)
        int x = 10;
        System.out.println(x++);
        System.out.println(x--);
        System.out.println(++x);
        System.out.println(--x);
        System.out.println(x++ == x+1);
        System.out.println(x++ == x-1);
        System.out.println(x++ == x);
        System.out.println(++x == x);

        //Complex expression: all operators except bitwise (slide 16) (solo)
        int year = 2000;
        System.out.print("Year " + year + " is a leap year: ");
        System.out.println(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        year = 100;
        System.out.print("Year " + year + " is a leap year: ");
        System.out.println(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        year = 2011;
        System.out.print("Year " + year + " is a leap year: ");
        System.out.println(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }    
}
