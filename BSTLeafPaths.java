package DSA;

import java.util.ArrayList;

public class BSTLeafPaths {
  static class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
    }
  } 
  public static Node insert(Node root, int val){
    if(root==null){
        root = new Node(val);
    }
    if(root.data>val){
        root.left = insert(root.left, val);
    }else if(root.data<val){
        root.right = insert(root.right, val);
    }
    return root;
  }
  public static void printPath(ArrayList<Integer>list){
    for(int i=0; i<list.size(); i++){
       System.out.print(list.get(i)+"->"); 
    }
    System.out.println();
  }
  public static void printRoot2Leaf(Node root, ArrayList<Integer>list){
    
    if(root == null){
        return;
    }
    list.add(root.data);

    if(root.left==null && root.right == null){
        printPath(list);
    }else{
        printRoot2Leaf(root.left,list);
        printRoot2Leaf(root.right, list);
    }
    list.remove(list.size()-1);
  }
  public static void main(String[] args) {
    int val[] = {8,5,3,6,10,11,14};
    Node root = null;
    for(int i=0; i<val.length; i++){
        root = insert(root,val[i]);
    }
    System.out.println(root.data);
    printRoot2Leaf(root, new ArrayList<>());
  } 
}
