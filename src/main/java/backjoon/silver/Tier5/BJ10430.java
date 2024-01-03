package backjoon.silver.Tier5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJ10430 {
    public static void main(String[] args) {

        String[] args1 = new String[]{"20", "7", "23", "19", "10", "15", "25", "8", "13"};
        List<Integer> height = Arrays.stream(args1)
                .map(Integer::valueOf)
                .toList();

    }

    private List<Integer> test(List<Integer> t, int total) {
        for (int i = 1; i < t.size(); i++) {
            if (t.get(0) + t.get(i) == total) {
                ArrayList<Integer> objects = new ArrayList<>();
                objects.add(t.get(i));
                objects.add(t.get(0));
                return objects;
            }
        }
        List<Integer> integers = t.subList(1, t.size());
        List<Integer> test = test(integers, total);
        return null;
    }
}
