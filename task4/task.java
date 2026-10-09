package task4;

public class task {
    public static void main(String[] args) {
        for (int a = 1; a <= 20; a++) {
            for (int b = a; b <= 20; b++) {
                int z = a * a + b * b;
                int c = (int) Math.sqrt(z);
                if (c <= 20 && c * c == z) {
                    System.out.println(a + "," + b + "," + c);
                }
            }
        }
    }
}