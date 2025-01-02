package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaBigInteger {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BigInteger a = new BigInteger(br.readLine());
            BigInteger b = new BigInteger(br.readLine());
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
