import java.util.Arrays;

public class LC100 {
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
     * Kiểm tra 2 cây giống nhau
     *
     * @param p cây cần kiểm tra 1
     * @param q cây cần kiểm tra 2
     * @return kết quả sau khi kiểm tra
     *
     * @author lehoangminh
     */

    /**
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) return false;

            boolean checkLeft = isSameTree(p.left, q.left);
            boolean checkRight = isSameTree(p.right, q.right);

            return (checkLeft && checkRight);
        } else if (p == null && q != null) {
            return false;
        } else if (p != null && q == null) {
            return false;
        } else {
            return true;
        }
    }
     **/

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Nếu node cùng = null -> giống nhau
        if (p == null && q == null) return true;
        // Một node = null và một node != null -> khác nhau -> false
        if ((p != null && q == null) || (p == null && q != null)) return false;
        // Hai node khác giá trị -> khác nhau -> false
        if (p.val != q.val) return false;
        // So sánh trái và phải của cây -> trả về kết quả đúng nếu trái và phải giống nhau
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if ((left != null && right == null) || (left == null && right != null)) return false;
        if (left.val != right.val) return false;

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
