//import java.util.Scanner;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
    }
}
class LL{
    Node head;
    void addLast(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
    void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void addMid(int val){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        Node newNode = new Node(val);
        if(head.next==null){
            head.next=newNode;
            return;
        }
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=newNode;
        newNode.next=slow;
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        head=head.next;
    }
    void deleteLast(){
        if(head==null){
            System.out.println("No");
        }
        if(head.next==null){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    void deleteVal(int val){
        if(head.next.val==val){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null && temp.val!=val){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Value is not present");
            return;
        }
        prev.next=temp.next;
    }
}
public class LinkedList {
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        LL ll=new LL();
        ll.addFirst(55);
        ll.addLast(45);
        ll.addFirst(5);
        ll.addMid(4);
        ll.addMid(3);
        ll.addMid(9);
        ll.addMid(66);
        ll.deleteVal(9);
        ll.deleteVal(9);
        
        ll.print(); 
}
}
