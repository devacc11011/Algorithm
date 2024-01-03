package barkingdog.L0x05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int i = Integer.parseInt(s);
        for (int j = 0; j < i; j++) {
            String k = br.readLine();
            int i1 = Integer.valueOf(k);
            if (i1 == 0) {
                stack.pop();
            } else {
                stack.push(i1);
            }
        }
        int total = stack.stream().mapToInt(integer -> integer).sum();
        System.out.println(total);
    }
}
