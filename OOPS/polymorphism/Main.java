package OOPS.polymorphism;

import java.sql.SQLOutput;

public class Main {

    public static class Product {
  
      public static int product(int x, int y) {
          System.out.println("lppp");
          return (x * y);
      }

      //overloading
      public int product(int x, int y, int z) {
        return (x * y * z);
      }
  
      public double product(double x, double y) {
        return (x * y);
      }
    }
    //overriding
    public static class B extends Product{
        public static int product(int x,int y){
            return x+y;
        }
    }
  
    // Driver code
    public static void main(String args[]) {
//      Product p = new Product();
//      System.out.println(p.product(2, 5));
//      System.out.println(p.product(2, 3, 5));
//      System.out.println(p.product(1.1, 2.5));
      B q=new B();
        System.out.println(q.product(2,3));
    }
  }
