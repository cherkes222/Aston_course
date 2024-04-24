import java.util.Scanner;
public class TaskThirdteen {
    static int n = 5;
    static int m = n;

    static int[][] a = new int[n][m];

    protected static void matrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = 0;
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
            }
        }

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    a[i][a.length-j-1] = 1;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}