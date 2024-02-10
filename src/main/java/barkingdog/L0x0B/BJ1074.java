package barkingdog.L0x0B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int r = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);

        int z = z(n, r, c);
        System.out.println(z);

    }

    private static int z(int n, int r, int c) {
        if (n == 0) {
            return 0;
        }
        int pow = (int) Math.pow(2, n - 1);
        int col = (c) / pow + 1;
        int row = (r) / pow;

        int square = col + row *2;
        if (square == 1) {
            return z(n - 1, r, c);
        } else if (square == 2) {
            return pow * pow + z(n - 1, r, c - pow);
        } else if (square == 3) {
            return pow * pow * 2 + z(n - 1, r - pow, c);
        } else if (square == 4) {
            return pow * pow * 3 + z(n - 1, r - pow, c - pow);
        }
        return c + (r * 2);
    }
}
