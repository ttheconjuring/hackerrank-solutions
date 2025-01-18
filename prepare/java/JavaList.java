package prepare.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaList {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            List<String> numbers = new ArrayList<>(List.of(br.readLine().split(" ")));
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                if (br.readLine().equals("Insert")) {
                    int[] xy = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                    if (xy[0] >= 0 && xy[0] <= numbers.size()) {
                        numbers.add(xy[0], String.valueOf(xy[1]));
                    }
                } else {
                    int x = Integer.parseInt(br.readLine());
                    if (x >= 0 && x < numbers.size()) {
                        numbers.remove(x);
                    }
                }
            }
            for (int i = 0; i < numbers.size() - 1; i++) {
                System.out.print(numbers.get(i) + " ");
            }
            System.out.print(numbers.get(numbers.size() - 1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

