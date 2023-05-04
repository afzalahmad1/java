import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class distance {
    public static ArrayList<Integer> dailyTemperatures(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        // int i=0;

        int count=0;
        for(int i=0;i<n;i++){
            count=1;
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
                count++;
            }
            list.add(count);
            while(!st.empty()){
                st.pop();
            }
            for(int j=0;j<=i;j++){
                st.push(j);
            }
        }
        return list;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ans;
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            //System.out.println(1);
        }
        ans=dailyTemperatures(arr);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }
    }
