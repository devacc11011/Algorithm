package barkingdog.L0x05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        String[] towers = reader.readLine().split(" ");

        Stack<Tower> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(towers[i]);

            while (true) {
                if (stack.isEmpty()) {
                    sb.append("0 ");
                    stack.add(new Tower(height, i));
                    break;
                }
                Tower preTower = stack.peek();
                if (preTower.getHeight() > height) {
                    sb.append(preTower.getN()).append(" ");
                    stack.add(new Tower(height, i));
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        System.out.println(sb);
    }
}

class Tower {
    private int height;
    private int n;

    public Tower(int height, int n) {
        this.height = height;
        this.n = n+1;
    }

    public int getHeight() {
        return height;
    }

    public int getN() {
        return n;
    }
}
