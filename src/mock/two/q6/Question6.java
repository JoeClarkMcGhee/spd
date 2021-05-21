package mock.two.q6;

public class Question6 {
    public static void main(String[] args) {
        IntTree t = new IntTree();
        System.out.println(t);
    }
}


class IntTree {
    private final IntTreeNode overallRoot = buildTreeAndReturnRoot();

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        processNode(overallRoot, description);
        return description.toString();
    }

    private void processNode(IntTreeNode node, StringBuilder description) {
        description.append("(");
        traversal(node, description);
        description.append(")");
    }

    private void traversal(IntTreeNode node, StringBuilder description) {
        description.append(node.data).append(", ");

        if (node.left == null) {
            description.append("empty, ");
        }
        else {
            if (node.left.isLeaf()) {
                description.append(node.left.data).append(", ");
            }
            else {
                processNode(node.left, description);
                description.append(", ");
            }
        }

        if (node.right == null) {
            description.append("empty");
        }
        else {
            if (node.right.isLeaf()) {
                description.append(node.right.data);
            }
            else {
                processNode(node.right, description);
            }
        }
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

    public Boolean isLeaf() {
        return this.left == null && this.right == null;
    }
}