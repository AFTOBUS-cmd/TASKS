import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        BigInteger b = BigInteger.valueOf(1);
        for(int i = 1; i <= a; i += 1) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Факториал = " + b);
    }
}
