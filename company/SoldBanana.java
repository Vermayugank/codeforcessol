package com.company;
import java.util.*;

public class SoldBanana {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int balance = sc.nextInt();
        int req = sc.nextInt();
        int money = 0;
        int borrow = 0;
        for (int i = 1 ; i<=req; i++){
            money = money +(cost*i);
        }
        if(money>balance) {
            borrow = money - balance;
            System.out.println(borrow);
        }
        else{
            System.out.println("0");
        }
    }
}