package barkingdog.L0x0C;

import java.io.*;
import java.util.*;

public class BJ15649 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] split = reader.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        Queue<Integer> var = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            var.add(i);
        }
        tracking(var, new ArrayDeque<>(), m);
        bw.flush();
        bw.close();
    }

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static void tracking(Queue<Integer> var, Deque<Integer> fix, int m) throws IOException {
        bw.write("--------start--------");
        bw.newLine();
        for (Integer i : var) {
            bw.write(String.valueOf(i));
            bw.write(" ");
        }
        bw.newLine();
        for (Integer i : fix) {
            bw.write(String.valueOf(i));
            bw.write(" ");
        }
        bw.newLine();
        bw.write("--------end--------");
        bw.newLine();




        if (fix.size() > m) {
            return;
        }
        if (fix.size() == m) {
            bw.write("ans :");
            for (Integer i : fix) {
                bw.write(String.valueOf(i));
                bw.write(" ");
            }
            bw.newLine();

            return;
        }
        for (int i = 0; i < var.size(); i++) {
            Integer remove = var.remove();

            Queue<Integer> copiedVar = new ArrayDeque<>(var);
            Deque<Integer> copiedFix = new ArrayDeque<>(fix);
            copiedFix.addLast(remove);

            tracking(copiedVar, copiedFix, m);
            var.add(remove);
        }
    }
}
