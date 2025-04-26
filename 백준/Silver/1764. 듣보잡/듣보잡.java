import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine(); // 개행 제거

        Set<String> unheard = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            unheard.add(in.nextLine());
        }

        for (int i = 0; i < m; i++) {
            String name = in.nextLine();
            if (unheard.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
