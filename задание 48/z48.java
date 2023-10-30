import java.util.HashSet;
import java.util.Scanner;

public class z48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите X");
        int x = scan.nextInt();
        HashSet<Integer> u = new HashSet<Integer>();
        for (int i = 0; i <= x; i++) {
            int y = 2 * i + 1;
            int z = 3 * i + 1;
            if (!u.contains(y)) {
                u.add(y);
            }
            if (!u.contains(z)) {
                u.add(z);
            }
            for (int j = y + 1; j < z; j++) {
                if (!u.contains(j)) {
                    u.add(j);
                }
            }
        }
        for (int num : u) {
            System.out.print(num + " ");
        }
    }
}
