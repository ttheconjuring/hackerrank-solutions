package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class JavaAnagrams {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(output(characterFrequencyMap(br.readLine().toLowerCase()))
                    .equals(output(characterFrequencyMap(br.readLine().toLowerCase())))
            ? "Anagrams" : "Not Anagrams");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Map<Character, Integer> characterFrequencyMap(String input) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }

    private static String output(Map<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            sb.append(characterIntegerEntry.getKey());
            sb.append(characterIntegerEntry.getValue());
        }
        return sb.toString();
    }

}
