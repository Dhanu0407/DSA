package DSA;

public class BSTPrintInRange {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
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
    public static void inOrder(Node root){
        if(root==null) return;
        
        inOrder(root.left);
        System.out.println(root.data+"");
        inOrder(root.right);
    }
    public static void printInRange(Node root, int x, int y){
       
       if(root == null){
        return;
       }
        if(root.data>=x && root.data<=y){
            printInRange(root.left, x, y);
            System.out.println(root.data);
            printInRange(root.right, x, y);
        }else if(root.data>=y){
            printInRange(root.left, x, y);
        }else{
            printInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int val[] = {8,3,4,1,6,2,10,11,14};
        Node root = null;

        for(int i=0; i<val.length; i++){
            root = insert(root,val[i]);
        }
        System.out.println(root.data);
        inOrder(root);
        System.out.println();
        printInRange(root, 3, 8);
    }
}
