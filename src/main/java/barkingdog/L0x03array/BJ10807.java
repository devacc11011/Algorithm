package barkingdog.L0x03array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(br.readLine());

        int[] occur = new int[201];
        String arrayLine = br.readLine();


        Arrays.stream(arrayLine.split(" "))
                .map(Integer::valueOf)
                .forEach(integer -> occur[integer+100]++);


        int v = Integer.parseInt(br.readLine())+100;

        System.out.println(occur[v]);
    }
}
