package DSA;
public class CountNodeBT {
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
  static class BTree{
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
  public static int countOfNodes(Node root){
    if(root==null){
        return 0;
    } 
    int leftNodes = countOfNodes(root.left);
      int rightNodes = countOfNodes(root.right);
      return leftNodes+rightNodes+1;
  }
  public static int sumOfNodes(Node root){
    if(root==null){
        return 0;
    } 
    int leftNodes = sumOfNodes(root.left);
      int rightNodes = sumOfNodes(root.right);
      return leftNodes+rightNodes+root.data;
  }
  public static int height(Node root){
    if(root==null){
        return 0;
    }
    int left = height(root.left);
    int right = height(root.right);

    int heightmax = Math.max(left,right)+1;

    return heightmax;
  }
  public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
  
  BTree tree = new BTree();
  Node root = tree.BuildTree(nodes);
  System.out.println(countOfNodes(root));
  System.out.println(sumOfNodes(root));
  System.out.println(height(root));

}  
}
