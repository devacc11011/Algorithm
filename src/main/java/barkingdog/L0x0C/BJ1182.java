package barkingdog.L0x0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1182 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] ns = reader.readLine().split(" ");
        int n = Integer.parseInt(ns[0]);
        int s = Integer.parseInt(ns[1]);

        String[] numStr = reader.readLine().split(" ");

        int[] nums = new int[n]
        int[] used = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i]=Integer.parseInt(numStr[i]);
        }


    }
}
