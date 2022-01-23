package com.company;
import java.util.*;

public class Translate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder s2b = new StringBuilder(s2);
        StringBuilder g= s2b.reverse();
        String b = g.toString();
        if(s1.compareTo(b)==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}