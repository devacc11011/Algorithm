package barkingdog.L0x05;

import java.io.*;
import java.util.Stack;

public class BJ6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Stack<Integer> stack = new Stack<>();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(reader.readLine());
            while (true) {
                if (stack.isEmpty() || stack.peek() > height) {
                    ans += stack.size();
                    stack.push(height);
                    break;
                }
                stack.pop();
            }

        }
        System.out.println(ans);
    }
}
