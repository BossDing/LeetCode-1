package Tree;

import org.junit.Test;

public class _101 {
    @Test
    public void Test() {

    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        return (left.val == right.val) && isMirror(left.right, right.left) && isMirror(left.left, right.right);
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
}
