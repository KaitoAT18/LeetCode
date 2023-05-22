public class LC700 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Tìm kiếm node có giá trị val trong BST
     *
     * @param root node cần xét
     * @param val  giá trị cần tìm
     * @return node có giá trị val cần tìm
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val > val) {
            return searchBST(root.left, val);
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return root;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        // Duyệt node trái sau đó duyệt node phải
        invertTree(root.left);
        invertTree(root.right);
        // Gán giá trị của node trái cho node phải
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
