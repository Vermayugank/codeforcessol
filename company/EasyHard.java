package com.company;

import java.util.Scanner;

public class EasyHard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String q = sc.nextLine();
        if(q.contains("1")){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
