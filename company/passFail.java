package com.company.codechef;

import java.util.Scanner;

public class passFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p=sc.nextInt();
            int no= x*3;
            no=no-(n-x);
            if (no>=p){
                System.out.println("Pass");
            } else System.out.println("Fail");
        }
    }
}
