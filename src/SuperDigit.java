  import java.util.*;
public class SuperDigit {

    
    // Function to calculate super digit
    public static int superDigit(long num) {
        if (num < 10) {
            return (int) num;
        }

        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return superDigit(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next(); // take as string
        int k = sc.nextInt();

        long initialSum = 0;

        // Step 1: sum of digits of n
        for (int i = 0; i < n.length(); i++) {
            initialSum += n.charAt(i) - '0';
        }

        // Step 2: multiply by k
        long total = initialSum * k;

        // Step 3: find super digit
        int result = superDigit(total);

        System.out.println(result);
    }
}