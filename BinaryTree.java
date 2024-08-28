package DSA;
import java.util.*;
public class BinaryTree {
  
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binary{
       static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx++;       
            if(nodes[idx]==-1){
           
            return null;
          }
          Node newNode = new Node(nodes[idx]);
          newNode.left = BuildTree(nodes);
          newNode.right = BuildTree(nodes);

          return newNode;
        }
    }
    public static void preorder(Node root){
      if(root == null){
        return;
      }  
      System.out.print(root.data+"");
      preorder(root.left);
      preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);    
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data+"");
        Inorder(root.right);
    }
    public static void levelOrder(Node root){
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       while(!q.isEmpty()){
        Node curr = q.remove();

        if(curr == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.println(curr.data+"");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
       }
    }
    public static void main(String[] args){
      int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary tree = new Binary();
     Node root = tree.BuildTree(nodes);
    preorder(root);
    postorder(root);
    Inorder(root);
    levelOrder(root);

    }
}
