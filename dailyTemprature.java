import java.util.*;
import java.util.Stack;

public class dailyTemprature {
    public static int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int []arr1=new int[n];
        // int i=0;
        //int j=n-1;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                arr1[i]=0;
            }
            else{
                arr1[i]=st.peek()-i;
            }
            st.push(i);
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(dailyTemperatures(arr));
    }
}
