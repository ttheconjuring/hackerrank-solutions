package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaSubstring {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            byte n = Byte.parseByte(input);
            byte m = Byte.parseByte(input);
            System.out.println(input.substring(n, m));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
