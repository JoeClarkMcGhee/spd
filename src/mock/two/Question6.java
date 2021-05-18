package mock.two;

public class Question6 {
    public static void main(String[] args) {
        IntTree t = new IntTree();
        System.out.println(t);
    }
}


class IntTree {
    private final IntTreeNode overallRoot = buildTreeAndReturnRoot();
    private StringBuilder out = new StringBuilder();

    public String toString(){
        traverse(overallRoot);
        return out.toString();
    }

    private void traverse(IntTreeNode node){
        if (node != null){
            visit(node);
            traverse(node.left);
            traverse(node.right);
        }
    }

    private void visit(IntTreeNode n){
        String d = Integer.toString(n.data);
        String l = n.left != null ? Integer.toString(n.left.data) : "empty";
        String r = n.right != null ? Integer.toString(n.right.data) : "empty";
        out.append(d + ", " + l + ", " + r);
    }

    private IntTreeNode buildTreeAndReturnRoot(){
        IntTreeNode two = new IntTreeNode(2);
        IntTreeNode eight = new IntTreeNode(8);
        IntTreeNode zero = new IntTreeNode(0);
        IntTreeNode one = new IntTreeNode(1);
        IntTreeNode seven = new IntTreeNode(7);
        IntTreeNode four = new IntTreeNode(4);
        IntTreeNode six = new IntTreeNode(6);
        IntTreeNode nine = new IntTreeNode(9);

        two.left = eight;
        two.right = one;
        eight.left = zero;
        one.left = seven;
        one.right = six;
        seven.left = four;
        six.right = nine;

        return two;
    }
}

class IntTreeNode {
    public int data;
    public IntTreeNode left = null;
    public IntTreeNode right = null;

    IntTreeNode(int data){
        this.data = data;
    }
}