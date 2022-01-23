package com.company;
import java.util.*;

public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = 0;
        int[] sq = new int[2];
        for(int i =0;i<2;i++){
            sq[i]=sc.nextInt();
            area=sq[0]*sq[1];
        }
        int d = 2;
        System.out.println(area/d);
    }
}