package com.company;

import java.util.Scanner;

public class accomodation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int p,q;
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            p = sc.nextInt();
            q= sc.nextInt();
            if((q-p)>=2){
                k++;
            }
        }
        System.out.println(k);
    }
}
