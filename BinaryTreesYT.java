public class BinaryTreesYT{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int index=-1;
        public static Node biuldTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left=biuldTree(nodes);
            newNode.right= biuldTree(nodes); 
            return newNode;



        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
         int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         BinaryTree tree = new BinaryTree();
         Node root = tree.biuldTree(nodes);

         //System.out.println(root.data);
         preorder(root);

    }
}