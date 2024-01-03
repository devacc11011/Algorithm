package barkingdog.L0x03array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());

        int[] ary = new int[10];

        while (true) {
            int rest = first % 10;
            if (first < 10 && rest == 0) {
                break;
            }

            ary[rest] += 1;


            first = first / 10;
        }
        int maxVal = 0;

        ary[6] += ary[9];
        ary[9] = 0;
        ary[6]= (int)Math.ceil(ary[6] / 2.0);

        for (int j : ary) {
            if (j > maxVal) {
                maxVal = j;
            }
        }

        System.out.println(maxVal);
    }
}
