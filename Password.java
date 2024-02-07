import java.util.Random;

public class Password {  
    public static void main(String[] args) {
        String password = generatePassword(15);
        System.out.print(password);
    }

    public static String generatePassword(int n) {
        String characterSet = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-=+/\\.,?><';ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String password = "";
        for(int i = 0; i < n; i++) {
            Random random = new Random();
            password += characterSet.charAt(random.nextInt(characterSet.length()));
        }
        return password;
    }
}
