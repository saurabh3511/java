package java_Assignment.Assignment6;


 class Part2 {

     public  Part2(){
        System.out.println("constructor one is running");
    }
    public  Part2(String s){
        this();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Part2 obj = new Part2("vishal");

    }
}