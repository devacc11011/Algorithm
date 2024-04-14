package barkingdog.L0x0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9663V2 {
    private  static int n;
    private static int[] checkedRow;
    private static boolean[] impossibleX;
    private static boolean[] impossibleDiagonal;
    private static boolean[] impossibleInvertedDiagonal;
    private static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        checkedRow = new int[n];
        impossibleX = new boolean[n*2-1];
        impossibleDiagonal = new boolean[n*2-1];
        impossibleInvertedDiagonal = new boolean[n*2-1];

        solve(0);
        System.out.println(ans);
    }

    private static void solve(int y) {
        if (y == n) {
            ans++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (impossibleX[i] || impossibleDiagonal[i+y] || impossibleInvertedDiagonal[i-y+(n-1)]) {
                continue;
            }
            impossibleX[i] = true;
            impossibleDiagonal[i + y] = true;
            impossibleInvertedDiagonal[i - y + (n - 1)] = true;
            solve(y+1);

            impossibleX[i] = false;
            impossibleDiagonal[i + y] = false;
            impossibleInvertedDiagonal[i - y + (n - 1)] = false;
        }
    }
}
