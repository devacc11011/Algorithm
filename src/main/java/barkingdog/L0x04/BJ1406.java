package barkingdog.L0x04;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class BJ1406 {
    public static void main(String[] args) throws IOException {
        Stack<Character> front = new Stack<>();
        Stack<Character> back = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        for (char c : string.toCharArray()) {
            front.push(c);
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            try {
                String cmd = br.readLine();
                if (cmd.equals("L")) {
                    back.push(front.pop());
                } else if (cmd.equals("D")) {
                    front.push(back.pop());
                } else if (cmd.equals("B")) {
                    front.pop();
                } else if (cmd.startsWith("P")) {
                    front.push(cmd.charAt(2));
                }
            } catch (EmptyStackException ignored) {

            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = back.size();
        for (int i = 0; i < size; i++) {
            front.push(back.pop());
        }
        for (Character c : front) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
