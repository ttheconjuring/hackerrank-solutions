package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops2 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int q = Integer.parseInt(br.readLine());
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < q; i++) {
                String[] line = br.readLine().split(" ");
                int a = Integer.parseInt(line[0]);
                int b = Integer.parseInt(line[1]);
                int n = Integer.parseInt(line[2]);
                for (int j = 0; j < n; j++) {
                    int sum = a;
                    for (int k = 0; k <= j; k++) {
                        sum += (Math.pow(2, k) * b);
                    }
                    output.append(sum).append(' ');
                }
                output.append('\n');
            }
            System.out.println(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
