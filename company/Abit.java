package com.company;
import java.util.*;

public class Abit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=0;
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s =sc.nextLine();
            if(Objects.equals(s, "X++") || Objects.equals(s, "++X")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
    }
}