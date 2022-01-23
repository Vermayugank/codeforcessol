package com.company;

import java.util.Scanner;

public class NearlyLucky {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String n =sc.next();
        int k =0;
        for(int i = 0;i<n.length();i++){
            if(n.charAt(i)=='4' || n.charAt(i)=='7'){
                k++;
            }
        }
        if(k==4 || k==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
