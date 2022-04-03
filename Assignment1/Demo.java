package java_Assignment.Assignment1;


import java.io.File;
import java.util.Scanner;

public class Demo {
    public void findFile(){
        File file= new File("C:\\Users\\Home\\eclipse-workspace\\oops_basic\\src\\project");
        String str;
        Scanner scn = new Scanner(System.in);
        boolean notFound=true;
        while(notFound) {
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            str = scn.nextLine();
            String[] files = file.list();
            for (String s : files) {
                if (str.equals(s)) {
                    System.out.println("File found");
                    System.out.println("Path : " + file.getAbsolutePath());
                    notFound = false;
                    break;
                }
            }
            if (notFound == true) {
                System.out.println("file not found please enter new file name");
            }
        }
    }
    public static void main(String[] args) {
        Demo obj =new Demo();
        //calling the findFile()
        obj.findFile();
    }
}