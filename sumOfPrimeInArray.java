import java.util.Scanner;

public class sumOfPrimeInArray {
    public static int sumOfPrime(int[] arr,int n){
        int sum=0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(isPrime(arr[i])){
                sum+=arr[i];
                flag=true;
            }
        }
        if(flag)
            return sum;
        return -1;
    }
    public static boolean isPrime(int n){
        if(n<=0 || n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumOfPrime(arr,n));
    }
}
