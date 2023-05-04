package OOPS;
class A{
    void meth(){
    System.out.println("Before override");
   }
}
class B extends A{
    void meth(){
        System.out.println("After override");
    }
}
public class overriding {
    public static void main(String args[]){
        A a=new A();
        a.meth();
        A b=new B();
        b.meth();
        B c=new B();
        c.meth();
    }
}
