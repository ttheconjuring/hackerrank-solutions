package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = new String[3];
            for (int i = 0; i < 3; i++) {
                input[i] = br.readLine();
            }
            System.out.println("================================");
            for (String line : input) {
                String[] parts = line.split(" ");
                System.out.printf("%-15s%s%n", parts[0], String.format("%03d", Integer.parseInt(parts[1])));
            }
            System.out.println("================================");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

    }

}
