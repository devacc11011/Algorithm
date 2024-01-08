package barkingdog.L0x04;

import java.io.*;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class BJ5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Stack<Character> front = new Stack<>();
        Stack<Character> back = new Stack<>();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int j = 0; j < n; j++) {
            String str = reader.readLine();
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                try {
                    if (c == '<') {
                        back.push(front.pop());
                    } else if (c == '>') {
                        front.push(back.pop());
                    } else if (c == '-') {
                        front.pop();
                    } else {
                        front.push(c);
                    }
                } catch (EmptyStackException ignore) {

                }
            }

            int size = back.size();
            for (int i = 0; i < size; i++) {
                front.push(back.pop());
            }
            for (Character c : front) {
                writer.write(c);
            }
            writer.newLine();
            front.clear();
            back.clear();
        }
        writer.flush();
        writer.close();
    }
}
