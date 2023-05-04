package OOPS;
class math{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
}
public class overloading {
    public static void main(String args[]){
    math m=new math();
    System.out.println(m.add(2.2,5.3));
    System.out.println(m.add(2,5));
    System.out.println(m.add(2,5,9));
    System.out.println(m.add("s","h"));
    }
}
 