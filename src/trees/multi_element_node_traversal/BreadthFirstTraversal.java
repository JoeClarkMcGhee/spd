package trees.multi_element_node_traversal;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
    public static void main(String[] args) {
        MultiElementNodeTree.Node node = new MultiElementNodeTree().getRoot();

        System.out.println("BF traverse");
        traverse(node);
    }

    private static void traverse(MultiElementNodeTree.Node rootNode) {
        Queue<MultiElementNodeTree.Node> queue = new LinkedList<>();
        queue.add(rootNode);

        while (!queue.isEmpty()){
            MultiElementNodeTree.Node node = queue.remove();
            visit(node);
            // we can addAll rather than doing a loop
            queue.addAll(node.children);
        }
    }

    static void visit(MultiElementNodeTree.Node node){
        System.out.print(node.name + ", ");
    }
}
