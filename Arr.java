import java.util.Arrays;

public class Arr {
    public static void main (String[] args) {
        
        final int N = 8; //constant

        //int []
        int[] digits = new int[N];
        System.out.println(digits);

        //Print out array item by item
        //Traditional loop
        for (int i = 0; i < digits.length; i++)
            System.out.print(digits[i] + " ");
        System.out.println();

        //Enhanced loop
        for (int digit : digits)
            System.out.print(digit + " ");
        System.out.println();

        //Arrays.toString
        System.out.println(Arrays.toString(digits));

        //Mutate array
        Arrays.fill(digits, 2);
        System.out.println(Arrays.toString(digits));

        //String []
        String[] names = new String [N];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names,"Sean");
        System.out.println(Arrays.toString(names));
        names[1] = "Fred";
        System.out.println(Arrays.toString(names));

        String[] philosophers = {"Aristotle", "Plato", "Kant"};
        System.out.println(philosophers);
        System.out.println(philosophers[1]);
        System.out.println(Arrays.toString(philosophers));

        int[] numbers ={20, 11, 33, 110, -21, 0, 5};
        System.out.println(Arrays.toString(numbers));

        //max
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++)
            if (max < numbers[i])
                max = numbers[i];
        System.out.println(max);
        
        //max with enhanced loop
        max = numbers[0];
        for (int number : numbers)
            if(max < number)
               max = number;
        System.out.println(max);

        //max with ternary
        max = numbers[0];
        for (int num : numbers)
            max = max < num ? num : max;
        System.out.println(max);

        //min with ternary
        int min = numbers[0];
        for (int x : numbers)
            min = min > x ? x : min;
        System.out.println(min);

        //Sum
        int sum = 0;
        for (int y : numbers)
            sum += y; //sum = sum + y
        System.out.println(sum);

        //average
        System.out.println(total(numbers) / numbers.length);

        //Reverse array attempt on my own

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        numbers[0] = numbers[5];
        numbers[1] = numbers[4];
        numbers[2] = numbers[3];
        numbers[3] = c;
        numbers[4] = b;
        numbers[5] = a;
         
        System.out.print("[");
        for (int z : numbers)
            if (z == a)
                System.out.print(z + "]");
            else 
                System.out.print(z + ", ");

        System.out.println();
        //Reverse array
        for (int i = 0, j = numbers.length -1; i < j; i++, j--) {
            int tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length -i -1];
            numbers[numbers.length -i -1] = tmp;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static int total(int [] numbers) {
        int sum = 0;
        for (int y : numbers)
            sum += y;

        return sum;
    }
}
