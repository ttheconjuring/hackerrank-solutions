package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStdinAndStdout1 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String lineOne = br.readLine();
            String lineTwo = br.readLine();
            String lineThree = br.readLine();
            System.out.println(lineOne);
            System.out.println(lineTwo);
            System.out.println(lineThree);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
