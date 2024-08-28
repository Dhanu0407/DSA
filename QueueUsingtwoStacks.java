package DSA;
import java.util.*;
public class QueueUsingtwoStacks{
    static class Queue{
        public static Stack<Integer> s1 = new Stack<>();
        public static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        } 
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int top = s1.pop();
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}