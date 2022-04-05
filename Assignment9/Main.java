package java_Assignment.Assignment9;

import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public void check(String str){
        String regexPattern ="[A-Z].*[.]";
        boolean flag=Pattern.matches(regexPattern,str);
        if(flag){
            System.out.println("Yes the given pattern matches the regex");
        }else{
            System.out.println("Sorry ! :(   it does not matches the regex");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=scn.nextLine();
        Main obj = new Main();
        obj.check(str);
    }
}