package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(new BigInteger(bufferedReader.readLine()).isProbablePrime(1)
            ? "prime" : "not prime");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
