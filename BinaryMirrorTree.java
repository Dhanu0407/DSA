package DSA;

public class BinaryMirrorTree {
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
        private static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
        public static void mirrorInorder(Node root){
            if(root==null){
                return;
            }
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            mirrorInorder(root.left);
            System.out.print(root.data);
            mirrorInorder(root.right);
            
        }
    }
    public static void main(String[] args){
        int[] nodes = {10,20,40,-1,-1,60,-1,-1,30,-1,-1};
        Binary tree = new Binary();

        Node root = tree.buildTree(nodes);

        //System.out.println(root.data);
        System.out.println("Inorder of tree");
        tree.inOrder(root);
        System.out.println("mirror");
        tree.mirrorInorder(root);
    }
}
