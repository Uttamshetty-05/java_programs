public class PalindromeCheck {
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String cleaned = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] samples = { "level", "Uttam", "A man a plan a canal Panama" };
        for (String sample : samples) {
            System.out.println(sample + " -> " + isPalindrome(sample));
        }
    }
}
