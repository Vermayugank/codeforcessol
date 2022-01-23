package com.company;
import java.util.*;

public class Team {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k =0;
        int sum = 0;
        int[] q = new int[3];
        int[] b =new int[1000];
        for(int i= 0;i<n;i++){
            for(int j= 0;j<=2;j++) {
                q[j] = sc.nextInt();
                sum = q[0]+q[1]+q[2];

            }
            b[i]=sum;
            if(b[i]>=2){
                k++;
            }
        }
        System.out.println(k);
    }
}