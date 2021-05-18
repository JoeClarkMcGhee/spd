package trees.two_element_node_traversal;

import java.util.Stack;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        TwoElementNodeTree.Node rootNode = new TwoElementNodeTree().getRoot();

        System.out.println("recursive traverse:");
        recursiveTraverse(rootNode);

        System.out.println("\niterative traverse:");
        iterativeTraverse(rootNode);
    }

    static void visit(TwoElementNodeTree.Node node){
        System.out.print(node.name + ", ");
    }

    static void recursiveTraverse(TwoElementNodeTree.Node node){
        if (node != null){
            visit(node);
            recursiveTraverse(node.left);
            recursiveTraverse(node.right);
        }
    }

    static void iterativeTraverse(TwoElementNodeTree.Node node){
        Stack<TwoElementNodeTree.Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            TwoElementNodeTree.Node current = stack.pop();
            visit(current);

            if(current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }


}
