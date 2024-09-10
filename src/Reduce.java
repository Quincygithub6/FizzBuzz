public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int n = 100;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = n - 1;
            }
            count++;
        }
        // Print the number of iterations it took to reduce n to 0
        System.out.println(count);
    }
}
