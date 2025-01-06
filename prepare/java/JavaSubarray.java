package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JavaSubarray {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int counter = 0;
            for (int i = 0; i < n; i++) {
                int sum = array[i];
                for (int j = i + 1; j < n; j++) {
                    sum += array[j];
                    if (sum < 0) {
                        counter++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (array[i] < 0) {
                    counter++;
                }
            }
            System.out.println(counter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 0 1 2 3 4 5
    // 1 -2 4 -5 1

    // 1 -2 -
    // 1 -2 4
    // 1 -2 4 -5 -
    // 1 -2 4 -5 1 -

    // -2 4
    // -2 4 -5 -
    // -2 4 -5 1 -

    // 4 -5 -
    // 4 -5 1

    // -5 1 -
}

