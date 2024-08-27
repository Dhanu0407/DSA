package DSA;

public class CircularQueueUsingArray {
 static class Queue{
    static int arr[];
    static int rear = -1;
    static int front = -1;
    static int size;

    Queue(int size){
        arr = new int[size];
        this.size = size;
    }
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public static void add(int data){
      if((rear+1)%size==front){
        return;
      }
      if(front==-1){
        front = 0;
      }
      rear = (rear+1)%size;
      arr[rear]=data;

    }
    public static int remove(){
        if(isEmpty()){
            return -1;
        }
        int top = arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front = (front+1)%size;
        }
        return top;
    }
    public static int peek(){
        return arr[front];
    }
 }   
 public static void main(String[] args) {
    Queue queue = new Queue(3);
      queue.add(1);
      queue.add(2);
      queue.add(3);
      queue.remove();
      queue.add(4);
      queue.remove();
      queue.add(5);
      
      while(!queue.isEmpty()){
         System.out.println(queue.peek());
         queue.remove();

      } 
 }
}
