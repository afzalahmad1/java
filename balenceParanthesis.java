import java.util.Scanner;
import java.util.Stack;

public class balenceParanthesis {
    public static boolean isbalance(char ch,Stack<Character> st){
        if(st.empty()){
            return true;
        }
        if(st.peek()=='[' && ch==']')
            return false;
        if(st.peek()=='{' && ch=='}')
            return false;
        if(st.peek()=='(' && ch==')')
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> st=new Stack<>();
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if(isbalance(s.charAt(i),st)){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        if(st.empty()){
            System.out.println("Balance");
        }
        else{
            System.out.println("Not Balance");
        }
    }
}
