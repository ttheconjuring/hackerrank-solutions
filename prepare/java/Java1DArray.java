package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java1DArray {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(br.readLine());
            }
            for (int i : array) {
                System.out.println(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
