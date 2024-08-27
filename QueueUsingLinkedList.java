package DSA;

public class QueueUsingLinkedList {
   static class Node{
    int data;
    Node next;
    Node(int data){
       this.data = data;
       next = null; 
    } 
   }
   static class Queue{
    public static Node head = null;
    public static Node tail = null;
     public static boolean isEmpty(){
        return head==null && tail==null;
     }
    public static void add(int data){
        Node newNode = new Node(data);
        if(tail==null){
            tail=head=newNode;
            return;
        }
        tail.next=newNode;
        tail = newNode;
    }
    public static int remove(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        if(head==tail){
            tail=null;
        }
        head = head.next;

        return top;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
   }
    public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
  }  
}
