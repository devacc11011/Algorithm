package barkingdog.L0x04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        Editor editor = new Editor(word);

        String cmdI = br.readLine();
        Integer i = Integer.valueOf(cmdI);
        for (int j = 0; j < i; j++) {
            String cmd = br.readLine();
            editor.command(cmd);
        }
        editor.print();

    }
}

class Editor {
    private final CharNode firstNode;
    private CharNode curNode;

    public Editor(String word) {
        firstNode = CharNode.createFirstNode();
        curNode = firstNode;
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            curNode = curNode.add(c);
        }
    }

    public void command(String cmd) {
        if (cmd.equals("L")) {
            curNode = curNode.previousCursor();
        }
        else if (cmd.equals("D")) {
            curNode = curNode.nextCursor();

        }
        else if (cmd.equals("B")) {
            curNode = curNode.remove();
        }
        else if (cmd.startsWith("P")) {
            char[] charArray = cmd.toCharArray();
            curNode =curNode.add(charArray[2]);
        }else {
            throw new RuntimeException();
        }
    }

    public void print() {
        CharNode startNode = firstNode.next;
        while (startNode != firstNode) {
            System.out.print(startNode.value);
            startNode = startNode.next;
        }
    }
}

class CharNode {
    public CharNode next;
    public CharNode pre;
    public boolean isFirst = false;
    public char value;

    public static CharNode createFirstNode() {
        CharNode charNode = new CharNode();
        charNode.pre = charNode;
        charNode.next = charNode;
        charNode.isFirst = true;
        return charNode;
    }

    public CharNode nextCursor() {
        if (next.isFirst) {
            return this;
        }
        return next;
    }

    public CharNode previousCursor() {
        if (this.isFirst) {
            return this;
        }
        return pre;
    }

    public CharNode add(char value) {
        CharNode newNode = new CharNode();
        newNode.next = next;
        newNode.pre = this;

        next.pre = newNode;
        next = newNode;


        newNode.value = value;
        return newNode;
    }

    public CharNode remove() {
        if (this.isFirst) {
            return this;
        }
        CharNode nextTemp = next;
        CharNode preTemp = pre;
        pre.next = nextTemp;
        next.pre = preTemp;
        return preTemp;
    }
}