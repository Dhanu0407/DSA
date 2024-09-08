package DSA;

class BST{
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
        if(root.data > val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    } 
      public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+"");
        inOrder(root.right);  
    }
    public static void main(String[] args) {
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        
       Node root = null;
       for(int i=0; i<nodes.length; i++){
        root = insert(root,nodes[i]);
       }
       inOrder(root);
       System.out.println();
    }
}