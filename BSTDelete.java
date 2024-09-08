package DSA;

public class BSTDelete {
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
        return root;
    }
    if(root.data<val){
        root.right = insert(root.right, val);
    }else if(root.data>val){
        root.left = insert(root.left,val);
    }
    return root;
  }
  public static void inorder(Node root){
    if(root==null) return;

    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
  }
  public static Node delete(Node root, int key){
    if(root == null) return null;
    if(root.data<key){
        root.right = delete(root.right, key);
    }else if(root.data>key){
        root.left = delete(root.left, key);
    }else{
        if(root.right==null && root.left==null){
            return null;
        }

        if(root.left == null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }

        Node Is = inOrderSuccessor(root.right);
        root.data = Is.data;
        root.right = delete(root.right,Is.data);
    }
    return root;
  }
  public static Node inOrderSuccessor(Node root){
    while(root.left!=null){
        root = root.left;
    }
    return root;
  }
  public static void main(String[] args) {
    int val[] = {8,3,4,1,6,10,11,14,6};
Node root = null;
    for(int i=0; i<val.length; i++){
        root = insert(root,val[i]);
    }
    System.out.println(root.data);
    inorder(root);
    delete(root, 3);
    inorder(root);
  }
}
