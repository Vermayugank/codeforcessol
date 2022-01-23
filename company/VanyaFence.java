package com.company;

import java.util.Scanner;

public class VanyaFence {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int k =0;
        for(int i = 0;i<n;i++){
            if(sc.nextInt()<=h){
                k++;
            }
            else{
                k=k+2;
            }
        }
        System.out.println(k);
    }
}
