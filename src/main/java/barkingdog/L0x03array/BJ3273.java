package barkingdog.L0x03array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strAry = br.readLine().split(" ");
        Integer[] array = Arrays.stream(strAry)
                .map(Integer::valueOf)
                .toArray(Integer[]::new);


        int[] occur = new int[2000001];
        for (Integer i : array) {
            occur[i] = 1;
        }

        int x = Integer.parseInt(br.readLine());

        int matched = 0;

        for (Integer i : array) {
            int i1 = x - i;
            if (i1 > 0 && occur[x - i] == 1) {
                matched++;
            }
        }

        System.out.println(matched/2);
    }
}
