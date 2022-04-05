package java_Assignment.Assignment5;

public class DefaultInitialization {

    public static void main(String[] args) {
        Saurabh S=new Saurabh();
        S.print();
        //p.printLocal();
        Singleton s=new Singleton();
        s.getEmail();
    }
}

class Singleton{
    String email;

    public static Singleton setEmail(String email) {
        //    this.email = email;
        return new Singleton();
    }

    public void getEmail() {
        System.out.println(this.email);
    }
}
class Saurabh{
    Character gender;
    int age;
    public void print(){
        System.out.print(this.age+" "+this.gender);
    }
//    public void printlocal(){
//     int height ;
//        int weight;
//        System.out.println(height+" "+weight);
//    }
    //we cannot print local variables without initializing them;
}