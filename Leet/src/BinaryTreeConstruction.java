public class BinaryTreeConstruction {
    int pointer = 0;
    public static class Treenode{
        char value;
        Treenode left,right;
        public Treenode(char value){
            this.value = value;
        }
    }
    public Treenode buildTree(char inOrder[], char preOrder[],int start, int end){

        if(start>end)
            return null;


        Treenode node = new Treenode(preOrder[pointer++]);
        if(start == end)
            return node;

        int indexRoot = searchIndex(inOrder,node.value);

            node.left =buildTree(inOrder,preOrder,start,indexRoot-1);
            node.right = buildTree(inOrder,preOrder,indexRoot+1,end);
            return node;
    }
    public int searchIndex(char[]inorder, int value){
        for(int i = 0;i <inorder.length;i++){
            if(inorder[i] == value)
                return i;
        }
        return -1;
    }
    public void inOrderTraversal(Treenode root){
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeConstruction tree = new BinaryTreeConstruction();
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length;
        Treenode root = tree.buildTree(in, pre, 0, len - 1);


        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.inOrderTraversal(root);
    }
}

