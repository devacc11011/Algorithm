package barkingdog.L0x03array;

public class P01 {
    public static void main(String[] args) {
        int[] a1 = {1, 52, 48};
        int[] a2 = {50, 42};
        int[] a3 = {4, 13, 63, 87};

        int result = solve(a1, 0);
        int result1 = solve(a2, 0);
        int result2 = solve(a3, 0);


        System.out.printf("result %d", result);
        System.out.println();
        System.out.printf("result1 %d", result1);
        System.out.println();
        System.out.printf("result2 %d", result2);

        assert result == 1;
        assert result1 == 0;
        assert result2 == 1;
    }

    private static int solve(int[] a2, int position) {
        if (a2.length == position + 1) {
            return 0;
        }
        int firstValue = a2[position];
        for (int i = position + 1; i < a2.length; i++) {
            int i1 = firstValue + a2[i];
            if (i1 == 100) {
                return 1;
            }
        }

        return solve(a2, position + 1);
    }
}

