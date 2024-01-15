package barkingdog.Lx09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class BJ2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = reader.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[][] maze = new int[n][m];
        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] split1 = reader.readLine().split("");
            for (int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(split1[j]);
                dist[i][j] = -1;
            }
        }
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        Queue<AbstractMap.SimpleEntry<Integer, Integer>> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i][j] == 0 || dist[i][j] != -1) {
                    continue;
                }
                dist[i][j] = 1;
                q.add(new AbstractMap.SimpleEntry<>(i, j));

                while (!q.isEmpty()) {
                    AbstractMap.SimpleEntry<Integer, Integer> cur = q.poll();
                    for (int k = 0; k < 4; k++) {
                        int nx = cur.getKey() + dx[k];
                        int ny = cur.getValue() + dy[k];
                        if (nx < 0 || ny < 0 || n <= nx || m <= ny ||
                                dist[nx][ny] != -1 || maze[nx][ny] == 0) {
                            continue;
                        }
                        q.add(new AbstractMap.SimpleEntry<>(nx,ny));
                        dist[nx][ny] = dist[cur.getKey()][cur.getValue()] +1;
                    }
                }
            }
        }
        System.out.println(dist[n-1][m-1]);
    }
}
