public class Ifelseif{
    public static void main(String args[]){
        
        //max(a,b)
        int a = 6;
        int b = 9;
        int z;

        if(a>b)
            z = a;
        else
            z = b;

        // z = a>b ? a:b;
        System.out.println(z);

        //min(a,b)
        if(a<b)
            z = a;
        else
            z = b;

        //ternary operator min
        System.out.println(a<b ?  a : b);

        //ternary operator max
        System.out.println(a>b ? a : b);

        //else-if
        int num = 5;
        if (num < 10) {
            System.out.println(num + " is small");
        } else if (num < 100) {
            System.out.println(num + " is medium");
        } else {
            System.out.println(num + " is large");
        }

        //ternary else if (don't do)
        String size;

        size = (num < 10 ? "is small" : num < 100 ? "is medium" : "is large");

        System.out.println(num + " " + size);
    }
}