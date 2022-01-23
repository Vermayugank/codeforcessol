package com.company;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int enter, exit, ccap, mincap;
        enter=exit=ccap=mincap=0;
        int sta = sc.nextInt();
        for(int i =0;i<sta;i++){
            exit = sc.nextInt();
            enter =sc.nextInt();
            ccap=ccap-exit;
            ccap=ccap+enter;
            if(ccap>mincap){
                mincap=ccap;
            }
        }
        System.out.println(mincap);
    }
}
