package barkingdog.L0x0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9663_tring {
    private static int[] usedY;
    private static int[] diagonal;
    private static int[] reversedDiagonal;
    private static int ans = 0;
    private static int n = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());

        usedY = new int[40];
        diagonal = new int[40];
        reversedDiagonal = new int[40];

        fuc(0);
        System.out.println(ans);
    }

    private static void fuc(int curr) {
        System.out.println(curr);
        if (curr == n) {
            ans++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (usedY[curr] == 1 || diagonal[curr + i] == 1 || reversedDiagonal[curr-i + n - 1] ==1) {
                continue;
            }
            usedY[i] = 1;
            diagonal[curr + i] = 1;
            reversedDiagonal[curr -i+ n - 1] = 1;
            fuc(curr+1);
            usedY[i] = 0;
            diagonal[curr + i] = 0;
            reversedDiagonal[curr-i + n - 1] = 0;
        }
    }
}
