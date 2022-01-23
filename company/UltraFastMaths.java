package com.company;

import java.util.Scanner;

public class UltraFastMaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        String s = sc.nextLine();
        char[] ans = new char[f.length()];
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)=='0'){
                if(s.charAt(i)=='0'){
                    ans[i]='0';
                }
                else{
                    ans[i]='1';
                }
            }
            else{
                if(s.charAt(i)=='1'){
                    ans[i]='0';
                }
                else{
                    ans[i]='1';
                }
            }
        }
        System.out.println(ans);
    }
}
