package trees.multi_element_node_traversal;

import java.util.Stack;

public class DepthFirstTraversal {
    public static void main(String[] args) {

        MultiElementNodeTree.Node node = new MultiElementNodeTree().getRoot();

        System.out.println("DF traverse");
        traverse(node);
    }

    private static void traverse(MultiElementNodeTree.Node rootNode) {
        Stack<MultiElementNodeTree.Node> stack = new Stack<>();
        stack.push(rootNode);

        while (!stack.isEmpty()){
            MultiElementNodeTree.Node node = stack.pop();
            visit(node);
            for (MultiElementNodeTree.Node n : node.children){
                stack.push(n);
            }
        }
    }

    static void visit(MultiElementNodeTree.Node node){
        System.out.print(node.name + ", ");
    }
}
