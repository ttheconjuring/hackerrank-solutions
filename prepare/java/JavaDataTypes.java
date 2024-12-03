package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaDataTypes {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < n; i++) {
                String input = br.readLine();
                long number;
                try {
                    number = Long.parseLong(input);
                } catch (NumberFormatException e) {
                    output.append(String.format("%s can't be fitted anywhere.%n", input));
                    continue;
                }
                output.append(String.format("%s can be fitted in:%n", input));
                if (Byte.MIN_VALUE <= number && number <= Byte.MAX_VALUE) {
                    output.append(String.format("* byte%n"));
                }
                if (Short.MIN_VALUE <= number && number <= Short.MAX_VALUE) {
                    output.append(String.format("* short%n"));
                }
                if (Integer.MIN_VALUE <= number && number <= Integer.MAX_VALUE) {
                    output.append(String.format("* int%n"));
                }
                if (Long.MIN_VALUE <= number && number <= Long.MAX_VALUE) {
                    output.append(String.format("* long%n"));
                }
            }
            System.out.println(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
