package barkingdog.L0x0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BJ1182V2 {
    private static List<Integer>ins = new LinkedList<>();
    private static int s;
    private static int n;
    private static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ns = reader.readLine().split(" ");
        n = Integer.parseInt(ns[0]);
        s = Integer.parseInt(ns[1]);

        String[] insStr = reader.readLine().split(" ");
        for (int j = 0; j < insStr.length; j++) {
            ins.add(Integer.parseInt(insStr[j]));
        }
        System.out.println(ans);
    }

    private static void solve(int start,int sum) {

    }
    }
