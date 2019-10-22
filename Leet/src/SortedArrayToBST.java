public class SortedArrayToBST {
    public static class TreeNode{
        int value;
        TreeNode left,right;
        public TreeNode(int value){
            this.value = value;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        else if (nums.length == 1)
            return new TreeNode(nums[0]);
        int mid;
        if(nums.length%2==0){
            mid = nums.length/2;
        }
        else{
            mid = (nums.length+1)/2;
        }
        TreeNode root = new TreeNode(nums[mid-1]);
        root.left = nextNode(nums,1,mid-1);
        root.right = nextNode(nums,mid+1,nums.length);
        return root;
    }
    public TreeNode nextNode(int nums[],int start, int end){
       if(start>end)
           return null;

       int mid = (start+end)/2;
       TreeNode node = new TreeNode(nums[mid-1]);

       if(start == end)
           return node;

       node.left = nextNode(nums,start,mid-1);
       node.right = nextNode(nums,mid+1,end);

       return node;
    }
    public void inOrderTraversal(TreeNode root){
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        SortedArrayToBST saltbst = new SortedArrayToBST();
        int[] nums = new int[]{};
        TreeNode root = saltbst.sortedArrayToBST(nums);
        saltbst.inOrderTraversal(root);
    }
}
