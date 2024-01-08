    package barkingdog.L0x05;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Stack;

    public class BJ3015_fail {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());

            Stack<Integer> stack = new Stack<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int height = Integer.parseInt(reader.readLine());
                ans+=stack.size();
                while (!stack.isEmpty() && stack.peek() < height) {
                    stack.pop();
                }
                stack.push(height);
            }
            System.out.println(ans);
        }
    }
