import java.util.Stack;

public class SumToLeaf {
    Stack<Integer>numbersFormed = new Stack<>();

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  public void inorderTraversal(TreeNode root,int sum){
        if(root == null)
            return;
        if(root.left == null && root.right ==null) {
            numbersFormed.push((sum * 10) + root.val);
            return;
        }
        inorderTraversal(root.left, (sum * 10) + root.val);


        inorderTraversal(root.right, (sum * 10) + root.val);
  }
    public int sumNumbers(TreeNode root) {
        int ans = 0;
        inorderTraversal(root,0);
        while (numbersFormed.size()>0){
            int number = numbersFormed.pop();
            ans = ans + number;
        }
        return ans;
    }
    public static void main(String[] args) {

        SumToLeaf stl = new SumToLeaf();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.left.right.left =  new TreeNode(7);
        root.left.right.right =  new TreeNode(4);
        System.out.println(stl.sumNumbers(root));
    }
}
