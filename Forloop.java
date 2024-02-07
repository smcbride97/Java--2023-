public class Forloop {
    public static void main(String args []) {

        int n = 10;

        System.out.println("Count up");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("Count down");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Count even");
        for (int i = 0; i <= n; i += 2){
            System.out.println(i);
        }

        System.out.println("Count odd");
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }

        System.out.println("Count every third");
        for (int i = 0; i <= n; i += 3) {
            System.out.println(i);
        }

        System.out.println("Count every sixth");
        for (int i = 0; i <= n; i += 6) {
            System.out.println(i);
        }

        System.out.println("2 to the power of 10");
        int result = 1;
        for (int i = 0; i <= n; i ++) {
            System.out.println(result);
            result *= 2;
        }

        int num = 24;
        System.out.println("Find the divisor");
        for (int i = 1; i <= num; i++) {
            if(num % i == 0)
                System.out.println(i);
        }

        // infinite loop 
        //int i = 0;
        //for(;;) {
            //System.out.println(i++);
        //}  
        
        //matrix with nested for loop
        n = 8;
        for (int i = 0; i < n; i++) { //row
            String s = "";
            for (int j =0; j<n; j++) //collumn
                s += "$";
            System.out.println(s);
        }

        //coordinates with nested for loop 
        n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("(" + i  + "," + j + ") ");
            System.out.println();
        }

        //nested for loop triangle attempt on my own
        n = 8;
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j <= i; j++)
                s += "$";
            System.out.println(s);
        }

        //nested for loop reverse triangle
        n = 8;
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = n - i; j > 1; j--)
                s += " ";
            for (int k = 0; k <= i; k++)
                s += "$";

            System.out.println(s);
        }

        //equal triangle
        n = 8;
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = n - i; j > 1; j--)
                s += " ";
            for (int k = 0; k <=  i; k++)
                s += "$ ";

            System.out.println(s);
        }

        //Christmas tree
        n = 8;
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = n-i; j > 1; j--)
                s += " ";
            for (int k = 0; k <= i; k++)
                s += "$ ";
            
            System.out.println(s);
        }
        for (int i = 0; i < n/2; i++) {
            String s = "";

            for (int j = 0; j < n - 1; j++)
                s += " ";
            s += "$";

            System.out.println(s);
        }
    }   
}
