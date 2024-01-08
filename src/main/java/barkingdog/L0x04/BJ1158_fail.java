package barkingdog.L0x04;

import java.io.*;
import java.util.LinkedList;

public class BJ1158_fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        LinkedList<Integer> integers = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            integers.add(i);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();
//        integers.

        while (!integers.isEmpty()) {
            int index = 2;
            if (integers.size() < 3) {
                index = integers.size() - 1;
                //size 1 - 0
                //size 2 - 1
                //size 3 - 2
                //size 4 - 3
            }
            Integer i = integers.get(index);
            integers.remove(index);

            stringBuilder.append(i);
        }

        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}
