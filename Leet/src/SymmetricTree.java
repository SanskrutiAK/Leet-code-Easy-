import java.util.Iterator;
import java.util.LinkedList;

public class SymmetricTree {
    public LinkedList<TreeNode> leftTree = new LinkedList<>();
    public LinkedList<TreeNode> rightTree= new LinkedList<>();
    public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
      public void inorderTraversal(TreeNode root,LinkedList<TreeNode> list){
        if(root == null)
            return;
        inorderTraversal(root.left,list);
        list.add(root);
        inorderTraversal(root.right,list);

      }
    public boolean isSymmetric(TreeNode root) {
          if(root == null)
              return true;
          if(root.left==null && root.right == null)
              return true;
          if(root.left==null && !(root.right == null))
              return false;
          if(root.right==null && !(root.left == null))
            return false;
          leftTree.add(root);
          rightTree.add(root);
          inorderTraversal(root.left,leftTree);
          inorderTraversal(root.right,rightTree);

          if (leftTree.size()!=rightTree.size())
              return false;
          else{
              Iterator leftSide =leftTree.iterator();
              Iterator rightSide = rightTree.iterator();
              while (leftSide.hasNext()&&rightSide.hasNext()){
                  if(((TreeNode)leftSide.next()).val != (((TreeNode)rightSide.next()).val))
                      return false;
              }
              return true;
          }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        SymmetricTree st = new SymmetricTree();
        System.out.println(st.isSymmetric(root));
    }
}
