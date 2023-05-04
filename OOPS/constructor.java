package OOPS;
class Student{
    String name;
    String name1;
    int age;
    Student(){
        System.out.println("Default constructor iss called");
    }
    Student(String s,int age){
       this.name=s;
       this.age=age;
    }
    Student(String s1,String s2,int age){
        this.name=s1;
        this.name1=s2;
        this.age=age;
    }
}
public class constructor {
    public static void main(String args[]){
        Student s1=new Student("Afzal",5);
        System.out.println("Name="+s1.name+"\n"+"Age="+s1.age);
        Student s2=new Student();
        Student s3=new Student("Afzal","Ahmad",24);
        System.out.println(s3.name+" "+s3.name1+" "+s3.age);
    }
}
