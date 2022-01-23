package com.company;
import java.util.*;

public class BearBro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l =sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while(l<=b){
            l = l*3;
            b= b*2;
            count++;
        }
        System.out.println(count);
    }
}