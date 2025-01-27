import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Map<String, Node> tree = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String start = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();

            tree.putIfAbsent(start, new Node(start));

            if (!left.equals(".")) {
                tree.putIfAbsent(left, new Node(left));
                tree.get(start).left = tree.get(left);
            }

            if (!right.equals(".")) {
                tree.putIfAbsent(right, new Node(right));
                tree.get(start).right = tree.get(right);
            }
        }
        StringBuilder preorder = new StringBuilder();
        StringBuilder inorder = new StringBuilder();
        StringBuilder postorder = new StringBuilder();

        Node root = tree.get("A");
        searchPreorder(root, preorder);
        searchInorder(root, inorder);
        searchPostorder(root, postorder);
        System.out.println(preorder);
        System.out.println(inorder);
        System.out.println(postorder);
    }

    private static void searchPreorder(Node node, StringBuilder result) {
        if (node == null) return;
        result.append(node.value);
        searchPreorder(node.left, result);
        searchPreorder(node.right, result);
    }

    private static void searchInorder(Node node, StringBuilder result) {
        if (node == null) return;
        searchInorder(node.left, result);
        result.append(node.value);
        searchInorder(node.right, result);
    }

    private static void searchPostorder(Node node, StringBuilder result) {
        if (node == null) return;
        searchPostorder(node.left, result);
        searchPostorder(node.right, result);
        result.append(node.value);
    }

    private static class Node {
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
        }
    }
}
