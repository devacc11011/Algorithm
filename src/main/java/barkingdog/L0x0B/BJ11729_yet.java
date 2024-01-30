package barkingdog.L0x0B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ11729_yet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Stack<Integer> top1 = new Stack<>();
        Stack<Integer> top2 = new Stack<>();
        Stack<Integer> top3 = new Stack<>();
        for (int i = n; i >= n; i--) {
            top1.push(i);
        }
    }

    private void movePlate(Stack<Integer> top1,Stack<Integer> top2,Stack<Integer> top3) {
        if (!top1.isEmpty()) {
            if (top1.peek() < top3.peek()) {

            }
        }
    }
}
