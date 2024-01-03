package barkingdog.L0x05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        Integer i = Integer.valueOf(word);

        MyStack myStack = new MyStack(i);
        for (int j = 0; j < i; j++) {
            String cmd = br.readLine();
            if (cmd.startsWith("push")) {
                Integer i1 = Integer.valueOf(cmd.split(" ")[1]);
                myStack.push(i1);
            } else if (cmd.equals("top")) {
                System.out.println(myStack.top());
            } else if (cmd.equals("size")) {
                System.out.println(myStack.size());
            } else if (cmd.equals("pop")) {
                System.out.println(myStack.pop());
            } else if (cmd.equals("empty")) {
                System.out.println(myStack.empty());
            }
        }
    }

}

class MyStack{
    public int[] array;
    public int pos = 0;

    public MyStack(int init) {
        array = new int[init];
    }

    public void push(int value) {
        array[pos++] = value;
    }
    public int pop() {
        if (pos == 0) {
            return -1;
        }
        return array[--pos];
    }

    public int size() {
        return pos;
    }

    public int empty() {
        return pos == 0 ? 1:0;
    }
    public int top() {
        if (pos == 0) {
            return -1;
        }
        return array[pos-1];
    }
}
