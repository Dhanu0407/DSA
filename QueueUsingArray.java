package DSA;

public class QueueUsingArray {
   
   static class Queue{
    static int arr[];
    static int size;
    static int rear = -1;
    Queue(int size){
        arr = new int[size];
        this.size = size;
    }
    public static boolean isEmpty(){
        return rear == -1;
    }
    public static void add(int data){
        if(rear == size-1){
            return;
        }
        rear++;
        arr[rear] = data;
    }
    public static int remove(){
        if(isEmpty()){
            return -1;
        }
        int front = arr[0];
        for(int i = 0; i<rear;i++){
          arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }
   }
    public static void main(String[] args) {
      Queue queue = new Queue(10);
      queue.add(1);
      queue.add(2);
      queue.add(3);
      queue.remove();
      
      while(!queue.isEmpty()){
         System.out.println(queue.peek());
         queue.remove();

      }
    }
}
 