public class Student{
    int id;
    String Name;
    Student(){
        System.out.println("Default constructor\n");
    }
    Student(int i, String n){
        id = i;
        Name = n;
    }

public static void main(String[] args){
    Student s = new Student();
    
    System.out.println("Default constructor value: \n");
    Student std = new Student(10, "Default Constructor");
    System.out.println("Student id: " + std.id + "\nStudent Name: " +std.Name);
    
    System.out.println("\nParameterized constructor value: \n");
    Student student = new Student(11, "Parameterized Constructor");
    System.out.println("Student id: " + student.id + "\nStudent Name: " +student.Name);
    
}
}
