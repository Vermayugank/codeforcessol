package com.company;
import java.util.*;

public class WrongMaths {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int no = sc.nextInt();
        int op= sc.nextInt();
        for(int i =0;i<op;i++){
            if((no%10)!=0){
               no = no -1;
            }
            else{
                no = no/10;
            }
        }
        System.out.println(no);
    }
}