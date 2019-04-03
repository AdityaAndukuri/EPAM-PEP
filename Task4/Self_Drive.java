import java.io.*;
import java.util.*;

public class Self_Drive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            adj.add(new TreeSet<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            set.add(i);
        }
        long count = 0;
        for (int i = 2; i <= n && !set.isEmpty(); i++) {
            count += set.size();
            HashSet<Integer> nextset = new HashSet<>();
            for (Integer ele : set) {
                if (ele + i - 1 < n && isConnected(ele + i - 1, ele, ele + i - 2)) {
                    nextset.add(ele);
                }
                if (ele > 0 && isConnected(ele - 1, ele, ele + i - 2)) {
                    nextset.add(ele - 1);
                }
            }
            set = nextset;
        }
        count += set.size();
        System.out.println(count);
    }
    static ArrayList<TreeSet<Integer>> adj = new ArrayList<>();

    static boolean isConnected(int node, int start, int end) {
        TreeSet<Integer> neighbors = adj.get(node);
        Integer possible = neighbors.higher(start - 1);
        return possible != null && possible <= end;
    }	
}