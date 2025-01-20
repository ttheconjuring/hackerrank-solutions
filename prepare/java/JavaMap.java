package prepare.java;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class JavaMap {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Map<String, String> nameNumberMap = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                nameNumberMap.put(br.readLine(), br.readLine());
            }
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                System.out.println((nameNumberMap.get(line) != null)
                        ? "%s=%s".formatted(line, nameNumberMap.get(line)) : "Not found");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

