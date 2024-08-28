package DSA;

public class twoStacksUsingArray {
 static class TwoStacks{
    static int arr[];
   static int size;
    static int top1,top2;
    TwoStacks(int size){
        this.size = size;
        arr = new int[size];
        top1 = size/2+1;
        top2 = size/2;
    }
    public static void push1(int data){
        if(top1>0){
            top1--;
         arr[top1] = data;
        
        }else{
            return;
        }
    }
    public static void push2(int data){
        if(top2<size-1){
            top2++;
         arr[top2] = data;
         
        }else{
            return;
        }
    }
    public static int pop1(){
        if(top1 <= size/2){
            int top = arr[top1];
            top1++;
            return top;
        }
        return -1;
    }
    public static int pop2(){
        if(top2 >= size/2+1){
            int top = arr[top2];
            top2--;
            return top;
        }
        return -1;
    }
 }
 public static void main(String[] args) {
    TwoStacks s = new TwoStacks(8);

    s.push1(2);
    s.push1(3);
    s.push2(4);
    System.out.println(s.pop1());
    System.out.println(s.pop2());
    System.out.println(s.pop2());
 }
}
