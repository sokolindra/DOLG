import java.util.Scanner;
public class z49 {
    public static void main(String[] args) {
        System.out.println("введите желаемое n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fusc(n));
    }
    public static int fusc(int i) {
        int x = 0;
        int y = 1;
        int c;
        if(i == 0) {
            return 0;
        }
        while(i >= 2) {
            if(i % 2 == 0) {
                i /= 2;
            } else {
                c = x;
                x += y;
                y = c;
                i--;
            }
        }
        return x + y;
    }
}
