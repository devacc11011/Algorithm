package barkingdog.L0x03array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer first = Integer.valueOf(br.readLine());
        Integer second = Integer.valueOf(br.readLine());
        Integer third = Integer.valueOf(br.readLine());

        int result = first * second * third;

        int[] ary = new int[10];

        while (true) {
            int rest = result % 10;
            if (result < 10 && rest == 0) {
                break;
            }
            ary[rest] += 1;

            result = result / 10;
        }

        for (int i : ary) {
            System.out.println(i);
        }
    }
}
