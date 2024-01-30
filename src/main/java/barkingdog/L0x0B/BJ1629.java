package barkingdog.L0x0B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] split = line.split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        long c = Long.parseLong(split[2]);

        System.out.println(cal(a, b, c));
    }

    private static long cal(long a, long b, long c) {
        if (b == 1) {
            return a % c;
        }
        long cal = cal(a, b / 2, c);
        long result  = cal * cal % c;
        if (c % 2 == 0) {
            return result;
        }
        return result * a % c;
    }
}
