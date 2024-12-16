package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringTokens {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine().replaceAll("[ !,?._'@]", " ").trim();
            if (input.isBlank()) {
                System.out.println(0);
                return;
            }
            String[] inputArray = input.split("\\s+");
            System.out.println(inputArray.length);
            for (String item : inputArray) {
                System.out.println(item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
