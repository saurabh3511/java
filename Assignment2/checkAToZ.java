package java_Assignment.Assignment2;

import java.util.HashMap;
import java.util.Scanner;

public class checkAToZ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a String : ");
        String input =  sc.next();
        boolean ans = checkString(input);
        System.out.println(ans);
    }
    public static boolean checkString(String input){
        int[] arr = new int[26];
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            arr[ch-'a'] =1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)  return false;
        }

        return true;
    }
}
