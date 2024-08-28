package DSA;
public class DiameterBT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BT{
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
    public static int heightTree(Node root){
        if(root==null) return 0;

        int left = heightTree(root.left);
        int right = heightTree(root.right);
        int maxH = Math.max(left,right)+1;

        return maxH;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        int diam3 = heightTree(root.left)+heightTree(root.right)+1;

        return Math.max(left, Math.max(right,diam3));
    }
 public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BT tree = new BT();
    Node root = tree.BuildTree(nodes);
    System.out.println(root.data);
   System.out.println(diameter(root));
}   
}
