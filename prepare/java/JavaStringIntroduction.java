package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringIntroduction {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            String b = br.readLine();
            System.out.println(a.length() + b.length());
            System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
            System.out.println(a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase() + " " + b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
