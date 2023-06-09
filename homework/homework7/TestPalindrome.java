import java.util.*;

public class TestPalindrome {
    public static void main(String[] args) {
        String kata;
        Stack<Character> stack = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan input: ");
        kata = input.next();

        for (int i = 0; i < kata.length(); i++) {
            char c = kata.charAt(i);
            stack.push(c);
        }
        boolean isPalindrom = false;
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == stack.pop()) {
                isPalindrom = true;
            }
            else {
                isPalindrom = false;
                break;
            }
        }
        System.out.println("Merupakan palindrom: ");
        System.out.println(isPalindrom);
        input.close();
    }
}
