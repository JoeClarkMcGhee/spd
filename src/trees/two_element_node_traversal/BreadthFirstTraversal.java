package trees.two_element_node_traversal;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
    public static void main(String[] args) {
        TwoElementNodeTree.Node rootNode = new TwoElementNodeTree().getRoot();

        Queue<TwoElementNodeTree.Node> queue = new LinkedList<>();
        queue.add(rootNode);

        System.out.println("recursive traverse:");
        recursiveTraverse(queue);

    }

    static void visit(TwoElementNodeTree.Node node){
        System.out.print(node.name + ", ");
    }

    static void recursiveTraverse(Queue<TwoElementNodeTree.Node> queue){
        if(!queue.isEmpty()){
            TwoElementNodeTree.Node node = queue.remove();
            visit(node);

            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }

            recursiveTraverse(queue);
        }
    }
}
