package barkingdog.L0x0C;

import java.io.*;

public class BJ15648_ans {
    private static int[] arr = new int[9];
    private static int[] used = new int[9];
    private static int n;
    private static int m;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] split = reader.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);

        func(0);
        bw.flush();
        bw.close();
    }

    private static void func(int k) throws IOException {
        if (k == m) {
            for (int i = 0; i < k; i++) {
                bw.write(String.valueOf(arr[i]));
                bw.write(" ");
            }
            bw.newLine();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (used[i] == 1) {
                continue;
            }
            arr[k] = i;
            used[i] = 1;
            func(k+1);
            used[i] = 0;
        }

    }
}
