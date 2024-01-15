package barkingdog.Lx09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] paint = new int[n][m];
        int[][] visit = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] split = reader.readLine().split(" ");
            for (int j = 0; j < split.length; j++) {
                paint[i][j] = Integer.parseInt(split[j]);
            }
        }



        int paintNum = 0;
        int areaMax = 0;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<AbstractMap.SimpleEntry<Integer, Integer>> queue = new ArrayDeque<>();
//        queue.add(new AbstractMap.SimpleEntry<>(0, 0));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (paint[i][j] == 0 || visit[i][j] == 1) {
                    continue;
                }
                paintNum++;
                int curArea = 0;
                visit[i][j] = 1;
                queue.add(new AbstractMap.SimpleEntry<>(i, j));
                while (!queue.isEmpty()) {
                    curArea++;
                    AbstractMap.SimpleEntry<Integer, Integer> cur = queue.poll();
                    Integer first = cur.getKey();
                    Integer second = cur.getValue();
                    for (int k = 0; k < 4; k++) {
                        int nx = first + dx[k];
                        int ny = second + dy[k];
                        if ((0 <= nx && 0 <= ny && nx < n && ny < m)
                                && (paint[nx][ny] == 1 && visit[nx][ny] == 0)) {
                            visit[nx][ny] = 1;
                            queue.add(new AbstractMap.SimpleEntry<>(nx, ny));
                        }

                    }
                }
                if (areaMax < curArea) {
                    areaMax = curArea;
                }
            }
        }

        System.out.println(paintNum);
        System.out.println(areaMax);
    }
}
