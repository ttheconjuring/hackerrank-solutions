package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                try {
                    Pattern.compile(br.readLine());
                    System.out.println("Valid");
                } catch (PatternSyntaxException e) {
                    System.out.println("Invalid");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
