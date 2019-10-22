public class MinimumDepthOfBinaryTree {
    int min_depth = Integer.MAX_VALUE;
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        inOrderTraversal(root,1);
        return min_depth;

    }
    public void inOrderTraversal(TreeNode root,int depth){
        if(root==null){
            return ;
        }
        int test = root.val;
        inOrderTraversal(root.left,depth+1);
        if((depth<min_depth) && (depth!=0)&&(root.left == null)&&(root.right == null))
            min_depth = depth;
        inOrderTraversal(root.right,depth+1);
    }
    public static void main(String[] args) {

        MinimumDepthOfBinaryTree mdbt = new MinimumDepthOfBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(0);
        System.out.println(mdbt.minDepth(root));

    }
}
