package java_Assignment.Assignment12;


import java.util.*;
import java.util.stream.Collectors;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    double perTillDate;
    public Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
        this.age=age;
        this.engDepartment=engDepartment;
        this.gender=gender;
        this.perTillDate=perTillDate;
        this.name=name;
        this.yearOfEnrollment=yearOfEnrollment;
        this.id=id;

    }
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return engDepartment;
    }

    public int getYearOfEnrollment()
    {
        return yearOfEnrollment;
    }

    public double  getPerTillDate()
    {
        return  perTillDate;
    }
    public static   void main(String[] args) {
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add( new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male","Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        // question 1
//        studentList.stream()
//                .map(Student::getDepartment)
//                .distinct()
//                .forEach(System.out::println);
//        //question 2
//        studentList.stream()
//                .filter(s -> s.getYearOfEnrollment()>2018)
//                .map(Student ::getName)
//                .forEach(System.out :: println);
        //question 3
//        studentList.stream()
//                .filter(s -> s.getDepartment()=="Computer Science")
//                .filter(s -> s.getGender()=="Male")
//              .map(Student ::getName)
//                .forEach(System.out :: println);
        //question 4
//        Map<String ,Long> countMaleFemale=
//               studentList.stream()
//                       .collect(Collectors.groupingBy(Student :: getGender,Collectors.counting()));
//        System.out.println(countMaleFemale);

        //question 5
//        Map<String ,Double> averageAgeOfMaleAndFemale=
//                studentList.stream()
//                        .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge)));
//        System.out.println(averageAgeOfMaleAndFemale);
        //question 6
//        Optional<Student> highestPercentageStudentWrapper=
//                studentList.stream()
//                        .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPerTillDate)));
//        Student studentHighestPercent=highestPercentageStudentWrapper.get();
//        System.out.println("Details Of Highest Percentage Student : ");
//
//        System.out.println("==================================");
//
//        System.out.println("ID : "+studentHighestPercent.getId());
//
//        System.out.println("Name : "+studentHighestPercent.getName());
//
//        System.out.println("Age : "+studentHighestPercent.getAge());
//
//        System.out.println("Gender : "+studentHighestPercent.getGender());
//
//        System.out.println("Department : "+studentHighestPercent.getDepartment());
//
//        System.out.println("Year Of Enrollment  : "+studentHighestPercent.getYearOfEnrollment());
//
//        System.out.println("percentage : "+studentHighestPercent.getPerTillDate());

        //question 7
//        Map<String,Long> studentCountByDepartment=
//        studentList.stream()
//                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
//        Set<Map.Entry<String,Long>>entrySet=studentCountByDepartment.entrySet();
//        for(Map.Entry<String,Long>entry : entrySet){
//            System.out.println(entry.getKey() +" : " +entry.getValue());
        //question 8
//        Map<String, Double> avgPercentageOfDepartments=
//                studentList.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getPerTillDate)));
//
//        Set<Map.Entry<String, Double>> entrySet = avgPercentageOfDepartments.entrySet();
//
//        for (Map.Entry<String, Double> entry : entrySet)
//        {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }

        //question 9
//        Optional<Student> youngestMaleStudentInElectronicsWrapper=
//                studentList.stream()
//                        .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Electronic")
//                        .min(Comparator.comparingInt(Student::getAge));
//        Student youngestMaleStudentInElectronics=youngestMaleStudentInElectronicsWrapper.get();
//       System.out.println("Details Of Highest Percentage Student : ");
//
//       System.out.println("==================================");
//
//        System.out.println("ID : "+youngestMaleStudentInElectronics.getId());
//
//        System.out.println("Name : "+youngestMaleStudentInElectronics.getName());
//
//       System.out.println("Age : "+youngestMaleStudentInElectronics.getAge());
//
//       System.out.println("Gender : "+youngestMaleStudentInElectronics.getGender());
//
//        System.out.println("Department : "+youngestMaleStudentInElectronics.getDepartment());
//       System.out.println("Year Of Enrollment  : "+youngestMaleStudentInElectronics.getYearOfEnrollment());
//
//       System.out.println("percentage : "+youngestMaleStudentInElectronics.getPerTillDate());

        //question 10
//        Map<String ,Long> countMaleFemale=
//             studentList.stream()
//                     .filter(s -> s.getDepartment()=="Computer Science")
//                      .collect(Collectors.groupingBy(Student :: getGender,Collectors.counting()));
//        System.out.println(countMaleFemale);
    }
}