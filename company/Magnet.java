package com.company;

import java.util.Scanner;

public class Magnet {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int g=0;
        int[] arr = new int[n+1];
        for(int i =0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        for(int j =0;j<n;j++){
            if(arr[j] != arr[j+1]){
                g++;
            }
        }
        System.out.println(g);
    }
}
