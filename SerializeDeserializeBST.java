import java.util.*;

public class SerializeDeserializeBST {
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v){val=v;} }

    // Preorder serialization
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) { sb.append("#,"); return; }
        sb.append(root.val).append(',');
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    public TreeNode deserialize(String s) {
        Queue<String> q = new LinkedList<>(Arrays.asList(s.split(",")));
        return deserialize(q);
    }

    private TreeNode deserialize(Queue<String> q) {
        String cur = q.poll();
        if (cur == null || cur.equals("#")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(cur));
        node.left = deserialize(q);
        node.right = deserialize(q);
        return node;
    }

    public static void main(String[] args) {
        SerializeDeserializeBST s = new SerializeDeserializeBST();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        String ser = s.serialize(root);
        System.out.println(ser);
        TreeNode d = s.deserialize(ser);
        System.out.println(d.val + "," + d.left.val + "," + d.right.val);
    }
}
