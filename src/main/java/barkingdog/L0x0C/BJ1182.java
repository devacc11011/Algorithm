package barkingdog.L0x0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1182 {
    static int[] nums;
    static boolean[] used;
    static int n;
    static int s;
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] ns = reader.readLine().split(" ");
        n = Integer.parseInt(ns[0]);
        s = Integer.parseInt(ns[1]);

        String[] numStr = reader.readLine().split(" ");

        nums = new int[n];
        used = new boolean[n];

        for (int i = 0; i < n; i++) {
            nums[i]=Integer.parseInt(numStr[i]);
        }

        for (int i = 0; i < n; i++) {
            solve(i,0);
        }
        System.out.println(ans);
    }

    private static void solve(int index,int sum) {
        if (index == n - 1) {
            return;
        }
        if (nums[index] + sum == s) {
            ans++;
        }
        for (int i = index+1; i <n; i++) {
            used[i] = true;
            solve(i,nums[index]+sum);
            used[i] = false;
        }
    }
}
