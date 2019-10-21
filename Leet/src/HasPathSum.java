import java.util.HashSet;

public class HasPathSum {
    HashSet<Integer> set = new HashSet<>();
    public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
      public void inorderTraversal(TreeNode root, int sum){
        if(root == null)
            return;
        if(root.left == null && root.right == null) {
            set.add((sum + root.val));
            return;
        }
        int currRoot = root.val;
        inorderTraversal(root.left,(sum+root.val));
        inorderTraversal(root.right,(sum+root.val));
      }
    public boolean hasPathSum(TreeNode root, int sum) {
        inorderTraversal(root,0);
        if(set.contains(sum))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        HasPathSum hps = new HasPathSum();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(hps.hasPathSum(root,22));
    }
}
