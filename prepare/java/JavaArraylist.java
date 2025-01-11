package prepare.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<List<Integer>> listOfList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }
            listOfList.add(list);
        }

        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            try {
                int v = listOfList.get(r - 1).get(c - 1);
                System.out.println(v);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
        sc.close();

    }

}

