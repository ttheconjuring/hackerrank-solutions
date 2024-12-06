package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaSubstringComparison {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();

            int n = input.length();
            int k = Integer.parseInt(br.readLine());
            int start = 0;

            List<String> substrings = new LinkedList<>();
            while (n - start >= k) {
                substrings.add(input.substring(start, start + k));
                ++start;
            }

            Collections.sort(substrings);
            System.out.println(substrings.getFirst());
            System.out.println(substrings.getLast());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
