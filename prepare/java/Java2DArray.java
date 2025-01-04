package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Java2DArray {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[][] array = new int[6][6];
            for (int i = 0; i < 6; i++) {
                int[] row = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int j = 0; j < 6; j++) {
                    array[i][j] = row[j];
                }
            }
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    sum += array[i][j] + array[i][j + 1] + array[i][j + 2]
                            + array[i + 1][j + 1]
                            + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                    if (sum > max) {
                        max = sum;
                    }
                    sum = 0;
                }
            }
            System.out.println(max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

