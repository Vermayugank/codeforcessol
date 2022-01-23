package com.company;
import java.util.*;

public class BeaMatrix {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int row = 0;
        int col = 0;
        for(int i = 0;i<5;i++) {
            String s =sc.nextLine().replace(" ", "");
            if(s.contains("1")){
                row=i+1;
                col=s.indexOf("1")+1;
            }

        }
        int fr= row-3;
        int fc= col-3;
        System.out.println(Math.abs(fr)+Math.abs(fc));

    }
}