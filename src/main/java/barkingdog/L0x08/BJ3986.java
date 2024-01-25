package barkingdog.L0x08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Stack<Character> goodWordPair = new Stack<>();

        int pair = 0;
        for (int i = 0; i < n; i++) {
            String word = reader.readLine();
            char[] charArray = word.toCharArray();
            for (char c : charArray) {
                if (!goodWordPair.isEmpty() && goodWordPair.peek() == c) {
                    goodWordPair.pop();
                } else {
                    goodWordPair.push(c);
                }
            }
            if (goodWordPair.isEmpty()) {
                pair++;
            }
            goodWordPair.clear();
        }
        System.out.println(pair);
    }
}
