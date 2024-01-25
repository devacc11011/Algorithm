package barkingdog.L0x08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class BJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> lines = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = reader.readLine();
            sb.append(s);
            if (s.endsWith(".")) {
                if (s.length() == 1) {
                    break;
                }
                lines.add(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        Stack<Character> brackets = new Stack<>();
        for (String line : lines) {
            brackets.clear();
            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    brackets.push(c);
                } else if (c == ')') {
                    if (!brackets.isEmpty() && brackets.peek() == '(') {
                        brackets.pop();
                    } else {
                        brackets.push('!');
                        break;
                    }
                } else if (c == ']') {
                    if (!brackets.isEmpty() && brackets.peek() == '[') {
                        brackets.pop();
                    }else {
                        brackets.push('!');
                        break;
                    }
                }
            }
            if (brackets.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}