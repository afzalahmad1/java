import java.util.*;

class  ArrayList_Stack<T>{
    ArrayList<T> arr;
    int top=-1;
   // int size;

    public ArrayList_Stack() {
        this.arr = new ArrayList<T>();
        //this.size = size;
    }
    boolean isEmpty(){
        return top==-1;
    }
    /*boolean isFull(){
        return top==size-1;
    }*/
    void push(T val){
        top++;
        arr.add(val);
    }
    T pop() {
        if (isEmpty()) {
            System.out.println("underflow");
            return null;
        }
          T res = arr.get(top);
            top--;
        return res;
    }
    void print(){
        if(isEmpty()){
            System.out.println("underflow");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    T peek(){
        if(isEmpty()){
            System.out.println("underflow");
            return null;
        }
        return arr.get(top);
    }
}
public class ArrayListStack {
    public static void main(String[] args) {
        ArrayList_Stack<Integer> st=new ArrayList_Stack<>();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<5;i++){
            st.push(arr[i]);
        }
        st.print();
        System.out.println(st.peek());
    }
}
