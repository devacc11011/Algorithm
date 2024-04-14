package barkingdog.L0x0D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ14683 {
    private static int[][] room;
    private static int[][] reserved;
    private static List<Cctv> cctvList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        room = new int[n][m];
        reserved = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] split = reader.readLine().split(" ");
            for (int j = 0; j < split.length; j++) {
                int tile = Integer.parseInt(split[j]);
                if (tile != 0 && tile != 6) {
                    cctvList.add(new Cctv(j,i,tile));
                }
            }
        }
        System.out.println(cctvList);
    }

    private void solve(int index) {
        Cctv cctv = cctvList.get(index);
        if (cctv.type == 1) {

        }
    }

    //0 up,1 right,2 down,3 left
    private void discover(int x,int y,int side) {
        if (side == 0) {

        }else if (side == 1) {

        } else if (side == 2) {

        } else {

        }
    }
}

class Cctv{
    public int x;
    public int y;
    public int type;

    public Cctv(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cctv{" +
                "x=" + x +
                ", y=" + y +
                ", type=" + type +
                '}';
    }
}