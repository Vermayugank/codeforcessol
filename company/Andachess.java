package com.company;
import java.util.*;
public class Andachess {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        int a=0;
        int d=0;
        String str = sc.nextLine();
        for(int i = 0; i<k;i++){
            if(str.charAt(i)=='A'){
                a++;
            }
            else{
                d++;
            }
        }
        if(a>d){
            System.out.println("Anton");
        }
        else if(d>a){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}