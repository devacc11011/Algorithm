    package barkingdog.L0x05;

    import java.io.*;
    import java.util.Stack;

    public class BJ17298 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());

            String[] array = reader.readLine().split(" ");
            Stack<Integer> stack = new Stack<>();
            int[] ans = new int[1000001];
            for (int i = array.length -1; i >= 0 ; i--) {
                int a = Integer.parseInt(array[i]);
                while (!stack.isEmpty() && stack.peek() <= a) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = stack.peek();
                }
                stack.push(a);
            }

//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                String s = array[i];
//                writer.write(ans[Integer.parseInt(s)]+" ");
                sb.append(ans[i]);
                if (i != array.length - 1) {
                    sb.append(" ");
                }
            }
//            writer.flush();
//            writer.close();
            System.out.println(sb.toString().trim());
        }
    }
