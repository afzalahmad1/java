class Stack{
    private int arr[];
    private int top;
    Stack(int size){
        arr=new int[size];
        top=-1;
    }
    public boolean isEmpty(){

        return (top==-1);
    }
    public boolean isFull(){
        return top==arr.length-1;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return ;
        }
        arr[++top]=val;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int res=arr[top];
        top--;
        return res;
    }
    public int size(){
        return top+1;
    }
    void print(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class ArrayStack {
    public static void main(String[] args) {
        int n=5;
        Stack st=new Stack(n);
        st.push(5);
        st.push(4);
        System.out.println(st.peek());
        System.out.println(st.size());
        st.print();

    }
}
