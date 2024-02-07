import java.lang.reflect.Array;
import java.util.Arrays;

public class ExceptExercise { 
    public static void main(String[] args) {
        int[] nums = new int[4];

        // simple catch
        try {
            nums[0] = 100;
            nums[6] = 200;
            System.out.println("HERE");
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        System.out.println(Arrays.toString(nums));

        //multi catch
        int[] number = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denum = {2, 8, 4, 4, 0, 8};

        for(int i = 0; i < number.length; i++) {
            try {
                System.out.printf("%d / %d is %d\n", number[i], denum[i], number[i] / denum[i]);
            } catch (ArithmeticException ex) {
                System.out.printf("%d / % d is illegal\n", number[i], denum[i]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.printf("No matching denominator found for %d\n", number[i]);
            }
        }

        for(int i = 0; i < number.length; i++) {
            try {
                System.out.printf("%d / %d is %d\n", number[i], denum[i], number[i] / denum[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Multi catch");
                System.out.println(ex);
            } 
        }

        // Create and throw exception
        try {
            System.out.println("Before exception");
            ArithmeticException aex = new ArithmeticException("This is exception created manually");
            // ArithmeticException ex = new ArithmeticException();
            Exception ex = new Exception("Nested exception", aex);
            throw ex;
            // System.out.println("After exception");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Catch exception");
        } catch (Exception ex) {
            System.out.println("Catch all exception");
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));
            System.out.println(ex.getCause());
        }  

        // rethrow
        try {
            rethrow();
        } catch (Exception ex) {
            System.out.println("Catch rethrow");
            System.out.println(ex.getMessage());
        }

        // create and throw and handle our own exception
        System.out.println();
        System.out.println("Customized Exception");
        int[] number2 = {4, 8, 15, 32, 64, 128, 256, 512};
        int[] denum2 = {2, 0, 4, 4, 0, 8};
        for(int i = 0; i < number2.length; i++) {
            try {
                System.out.printf("%d / %d is %d\n", number2[i], denum2[i], number2[i] / denum2[i]);
                if (number2[i] % denum2[i] != 0)
                    throw new NonIntResultException(number2[i], denum2[i]);
            } catch (ArithmeticException ex) {
                System.out.printf("%d / % d is illegal\n", number2[i], denum2[i]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.printf("No matching denominator found for %d\n", number2[i]);
            } catch (NonIntResultException ex) {
                System.out.println(ex);
            }
        }
    }

    // rethrow
    public static void rethrow() throws Exception {
        try {
            ArithmeticException ex = new ArithmeticException("This is exception created manually for rethrowing");
            throw ex;
            // System.out.println("After exception");
        }   catch (ArithmeticException ex) {
            System.out.println("Catch ArithmeticException");
            throw new Exception("Rethrow nested exception", ex);
        } finally {
            System.out.println("rethrow exception end");
        }
    }
}

class NonIntResultException extends Exception {
    private int x, y;

    NonIntResultException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "The result of dividing " + x + " by " + y + " is not integer";
    }   
}