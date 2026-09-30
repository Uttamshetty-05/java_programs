public class ReverseNumber {
    public static int reverse(int n) {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed * sign;
    }

    public static void main(String[] args) {
        int[] samples = { 1234, -90, 100 };
        for (int sample : samples) {
            System.out.println(sample + " -> " + reverse(sample));
        }
    }
}
