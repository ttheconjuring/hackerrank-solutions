package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidUsernameRegularExpression {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String username = br.readLine();
                if (username.length() < 8 || username.length() > 30) {
                    System.out.println("Invalid");
                    continue;
                }
                if (!username.matches("[a-zA-Z][a-zA-Z0-9_]+")) {
                    System.out.println("Invalid");
                    continue;
                }
                System.out.println("Valid");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
