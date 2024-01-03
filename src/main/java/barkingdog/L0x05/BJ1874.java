package barkingdog.L0x05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BJ1874 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(s);
        for (int j = 0; j < i; j++) {
            String s1 = br.readLine();
            stack.push(Integer.valueOf(s1));
        }
        for (int j = 1; j <= i; j++) {
//            stack.

        }
    }
}
