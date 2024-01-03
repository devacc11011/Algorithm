package barkingdog.L0x03array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] result = new int[26];
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            int i = c - 97;
            result[i] += 1;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }
    }
}
