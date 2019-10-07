public class BinarySearchTree {
    class Node {
        int key;
        Node left,right;
        public Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    Node root = null;
    void insert(int key){
        root = insertNode(root,key);
    }

    Node insertNode(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        else if(key>root.key){
            root.right = insertNode(root.right,key);
        }
        else if(key<root.key){
            root.left = insertNode(root.left,key);
        }
        return root;
    }

    void inorder(){
        inorderTraversal(root);
    }

    void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.println(root.key);
            inorderTraversal(root.right);
        }
    }
    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.inorder();

    }
}
