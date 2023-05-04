package encapsulation;
class  Employee{
    private int empid;
    public void setEmpid(int val){
        empid=val;
    }
    public int getEmpid(){
        return empid;
    }
}
public class Main {
    public static void main(String args[]){
        Employee e=new Employee();
        e.setEmpid(111);
        System.out.println(e.getEmpid());
    }
}
