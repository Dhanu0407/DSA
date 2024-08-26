package DSA;

import java.util.ArrayList;

public class StackUsingArrayList {
 static class stack{
  static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty(){
        return list.size() == 0;
    }
    public static void push(int data){
      list.add(data);
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
       int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek(){
        if(isEmpty()) return -1;
        int top = list.get(list.size()-1);
        return top;
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
