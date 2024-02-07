public class Whileloop {
    public static void main(String args[]) {
        
        int n = 10;
        int i;
        
        //Count up
        System.out.println("Count up");
        i = 1;
        while (i <= n) 
            System.out.println(i++);

        //Count down
        System.out.println("Count down");
        i = n;
        while (i > 0) 
            System.out.println(i--);
        
        //Count even
        System.out.println("Count even");
        i = 0;
        while (i < n) {
            System.out.println(i);
            i += 2; //i = i + 2
        }

        //Count odd
        System.out.println("Count odd");
        i = 1;
        while (i < n) {
            System.out.println(i);
            i += 2;
        }

        //Every third number
        System.out.println("Every third");
        i = 0;
        while (i < n) {
            System.out.println(i);
            i += 3; //i = i + 3
        }

        //Every sixth number
        System.out.println("Every sixth");
        i = 0;
        while (i < n) {
            System.out.println(i);
            i += 6; //i = i + 6
        }

        //Two to the power of 10
        System.out.println("2 to the power of 10 is: ");
        int result = 1;
        i = 0;
        while (i++ <= n) {
            System.out.println(result);
            result *= 2;
        }

        //Find divisors
        System.out.println("Find the divisor: ");
        int num = 10;
        int div = 1;

        while (div <= num) {
            if(num % div == 0)
                System.out.println(div);
            div++;
        }

        //Prime numbers
        num = 10;
        i = 2;

        while(i < num) {
            int j = 2;
            boolean isPrime = true;

            while (j < i) {
                if (i % j == 0){
                    isPrime = false;
                break;
                }
                j++;
            }

            if (isPrime)
                System.out.println(i + " is prime number.");
            i++;
        }  
    } 
}
