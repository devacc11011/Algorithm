package barkingdog.L0x06queue;

import java.io.*;

public class BJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        MyQueue myQueue = new MyQueue(10000);
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] cmd = reader.readLine().split(" ");
            if (cmd[0].startsWith("push")) {
                myQueue.push(Integer.parseInt(cmd[1]));
            } else if (cmd[0].startsWith("pop")) {
                sb.append(myQueue.pop())
                        .append("\n");
            } else if (cmd[0].equals("size")) {
                sb.append(myQueue.size())
                        .append("\n");

            } else if (cmd[0].equals("empty")) {
                sb.append(myQueue.empty())
                        .append("\n");

            } else if (cmd[0].equals("front")) {
                sb.append(myQueue.front())
                        .append("\n");

            } else if (cmd[0].equals("back")) {
                sb.append(myQueue.back())
                        .append("\n");

            }
        }

        System.out.println(sb);
    }

}

class MyQueue {
    private int[] arr;
    private int head = 0;
    private int tail = 1;

    public void push(int newValue) {
        arr[tail-1] = newValue;
        tail++;
    }

    public int pop() {
        if (tail - head == 1) {
            return -1;
        }
        return arr[head++];
    }

    public int size() {
        return tail - head -1;
    }

    public int empty() {
        return tail - head == 1 ? 1 : 0;
    }

    public int front() {
        return this.empty() == 1 ? -1 : arr[head];
    }

    public int back() {
        return this.empty() == 1 ? -1 : arr[tail-2];
    }

    public MyQueue(int size) {
        this.arr = new int[size];
    }
}
