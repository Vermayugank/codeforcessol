package com.company;
import java.util.*;
public class Capta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = s.substring(0,1);
        String res= s.substring(1,s.length());
        String cap = sub.toUpperCase();
        System.out.println(cap + res);
    }
}