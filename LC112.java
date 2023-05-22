public class LC112 {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return browsing(root, 0, targetSum);
    }

    private boolean browsing(TreeNode currentNode, int currentSum, int targetSum) {
        // B1: Điều kiện dừng || Bài toán cơ sở
        if (currentNode == null) return false;
        currentSum += currentNode.val;
        if (isLeaf(currentNode)) {
            return currentSum == targetSum;
        }
        boolean left = browsing(currentNode.left, currentSum, targetSum);
        boolean right = browsing(currentNode.right, currentSum, targetSum);
        return left || right;
    }

    private boolean isLeaf(TreeNode currentNode) {
        return currentNode.left == null && currentNode.right == null;
    }
}
