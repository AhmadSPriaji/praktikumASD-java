import java.util.*;

public class TestReverseString {
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

        System.out.println("Hasil reverse: ");
        while (!stack.isEmpty()) {
            char c = stack.pop();
            System.out.print(c);
        }

        input.close();
    }
}