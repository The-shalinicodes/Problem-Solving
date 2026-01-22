class Solution {

    class Pair {
        TreeNode node;
        int state;

        Pair(TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    List<List<Integer>> treeTraversal(TreeNode root) {

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            result.add(pre);
            result.add(in);
            result.add(post);
            return result;
        }

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {
            Pair p = st.pop();

            if (p.state == 1) {
                pre.add(p.node.data);
                p.state++;
                st.push(p);

                if (p.node.left != null)
                    st.push(new Pair(p.node.left, 1));

            } else if (p.state == 2) {
                in.add(p.node.data);
                p.state++;
                st.push(p);

                if (p.node.right != null)
                    st.push(new Pair(p.node.right, 1));

            } else {
                post.add(p.node.data);
            }
        }

        result.add(in);
        result.add(pre);
        result.add(post);

        return result;
    }
}
