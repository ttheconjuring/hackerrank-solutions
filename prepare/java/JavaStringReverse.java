package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringReverse {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String input = br.readLine();
            String reversedInput = reverse(input);
            System.out.println(input.equals(reversedInput) ?  "Yes" : "No");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static String reverse(String input) {
        int n = input.length();
        StringBuilder reversed = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

}
