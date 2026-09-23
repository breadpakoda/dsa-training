import java.util.Scanner;

public class P69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = true;
        int[][] cord = new int[n][3];
        for (int i = 0; i < cord.length; i++) {
            for (int j = 0; j < cord[i].length; j++) {

                cord[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < cord[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < cord.length; j++) {

                sum += cord[j][i];

            }
            if (sum != 0) {
                ans = false;
            }
        }

        if (ans) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}