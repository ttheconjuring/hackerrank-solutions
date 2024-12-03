package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStdinAndStdout2 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(br.readLine());
            double y = Double.parseDouble(br.readLine());
            String z = br.readLine();
            System.out.println("String: " + z);
            System.out.println("Double: " + y);
            System.out.println("Int: " + x);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
