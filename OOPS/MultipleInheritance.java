package OOPS;
interface A1 {
   abstract void run1();
}
interface B1{


    abstract void run2();
}
class C1 implements A1,B1{
    public void run1(){
        System.out.println("Interface A1");
    }
    public void run2(){
        System.out.println("Interface B1");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C1 c=new C1();
        c.run1();
        c.run2();
    }
}
