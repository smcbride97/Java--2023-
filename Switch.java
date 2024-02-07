import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
    
        Scanner in = new Scanner(System.in);
        int day;

        System.out.println("Which day is it?");

        //Asks the user to input a value for the day
        while ((day = in.nextInt()) != 0) {
        System.out.println("On the " + day + " day of Christmas");

            switch (day) {
                case 1:
                    System.out.println("A partridge in a pear tree");
                    break;
                case 2:
                    System.out.println("Two turtle doves");
                    break;
                case 3:
                    System.out.println("Three french hens");
                    break;
                case 4:
                    System.out.println("Four calling birds");
                    break;
                case 5:
                    System.out.println("Five gold rings");
                    break;
                case 6:
                    System.out.println("Six geese a-laying");
                    break;
                case 7:
                    System.out.println("Seven swans a-swimming");
                    break;
                case 8:
                    System.out.println("Eight maids a-milking");
                    break;
                case 9:
                    System.out.println("Nine ladies dancing");
                    break;
                case 10:
                    System.out.println("Ten lords a-leaping");
                    break;
                case 11:
                    System.out.println("Eleven pipers piping");
                    break;
                case 12:
                    System.out.println("Twelve drummers drumming");
                    break;
                default:
                    System.out.println(day + " is wrong day");
            }

            System.out.println("Which day is it: ");
        }
    } 
}
