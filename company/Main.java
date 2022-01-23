package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String f = s1.toLowerCase();
        String l = s2.toLowerCase();
        int k = f.compareTo(l);
        if(k>0){
            System.out.println("1");
        }
        else if(k<0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }

    }
}
