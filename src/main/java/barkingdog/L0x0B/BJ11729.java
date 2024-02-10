package barkingdog.L0x0B;

import java.io.*;

public class BJ11729 {
    private static StringBuilder sb = new StringBuilder();
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        movePlate(1, 3, n);
        bw.write(sb.toString());
        bw.close();
    }
    private static void movePlate(int asIs, int toBe, int size) throws IOException {
        if (size == 1) {
            sb.append(asIs);
            sb.append(" ");
            sb.append(3);
            sb.append("\n");
            return;
        }
        movePlate(asIs, 6 - asIs - toBe, size - 1);

        sb.append(asIs);
        sb.append(" ");
        sb.append(toBe);
        sb.append("\n");

        movePlate(6 - asIs - toBe, toBe, size - 1);
    }
}
