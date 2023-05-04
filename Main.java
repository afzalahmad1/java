import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=0;
        int secLast=0;
        boolean flag=false;
        int maxNumber=0;
        if(n>0 && n<=9){
            System.out.println(n);
        }
        for(int i=n;i>=10;i--){
            int t=i;
            flag=false;
            while(t>0){
                int temp=i;
                last=i%10;
                temp/=10;
                secLast=temp%100;
                if(last<secLast){
                    break;
                }
                else{
                    maxNumber=i;
                }
                t=t/10;
            }
        }
        System.out.println(maxNumber);
    }
}
