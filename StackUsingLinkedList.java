package DSA;
public class StackUsingLinkedList {
   static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
   }

   static class stack{
    public static Node head;
     public static boolean isEmpty(){
        return (head==null);
     }
    public static void push(int data){
       Node newNode = new Node(data);
        if(isEmpty()){
         head = newNode;
         return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
          }
        int top = head.data;
     
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
    public static void main(String[]args){

    stack obj = new stack();
    obj.push(2);
    obj.push(3);
    obj.push(4);
    obj.push(5);

    while(!obj.isEmpty()){
       System.out.println(obj.peek());
       obj.pop();
    }


   }
}
