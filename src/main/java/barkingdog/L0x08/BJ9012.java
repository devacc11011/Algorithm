        package barkingdog.L0x08;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Stack;

        public class BJ9012 {
            public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(reader.readLine());

                Stack<Character> brackets = new Stack<>();
                for (int i = 0; i < n; i++) {
                    char[] charArray = reader.readLine().toCharArray();
                    for (int i1 = 0; i1 < charArray.length; i1++) {
                        char c = charArray[i1];
                        if (c == ')') {
                            if (!brackets.isEmpty() && brackets.peek() == '(') {
                                brackets.pop();
                            } else {
                                brackets.push('!');
                                break;
                            }
                        } else {
                            brackets.push(c);
                        }
                    }
                    if (brackets.isEmpty()) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    brackets.clear();
                }
            }
        }
