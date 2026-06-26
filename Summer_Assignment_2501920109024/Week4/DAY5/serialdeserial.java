/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Serialize
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb) {

        if (root == null) {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(",");

        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    // Deserialize
    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        Queue<String> queue = new LinkedList<>();

        for (String s : arr) {
            queue.offer(s);
        }

        return build(queue);
    }

    private TreeNode build(Queue<String> queue) {

        String curr = queue.poll();

        if (curr.equals("#"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(curr));

        root.left = build(queue);
        root.right = build(queue);

        return root;
    }
}