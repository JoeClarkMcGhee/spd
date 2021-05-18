package trees.multi_element_node_traversal;

import trees.two_element_node_traversal.TwoElementNodeTree;

import java.util.ArrayList;

public class MultiElementNodeTree {

    class Node{

        String name;
        ArrayList<Node> children = new ArrayList<>();

        Node(String name){
            this.name= name;
        }
    }

    MultiElementNodeTree.Node one   = new MultiElementNodeTree.Node("one");
    MultiElementNodeTree.Node two   = new MultiElementNodeTree.Node("two");
    MultiElementNodeTree.Node three = new MultiElementNodeTree.Node("three");
    MultiElementNodeTree.Node four  = new MultiElementNodeTree.Node("four");
    MultiElementNodeTree.Node five  = new MultiElementNodeTree.Node("five");
    MultiElementNodeTree.Node six   = new MultiElementNodeTree.Node("six");
    MultiElementNodeTree.Node seven = new MultiElementNodeTree.Node("seven");
    MultiElementNodeTree.Node eight = new MultiElementNodeTree.Node("eight");
    MultiElementNodeTree.Node nine  = new MultiElementNodeTree.Node("nine");

    public MultiElementNodeTree.Node getRoot(){
        buildTree();
        return one;
    }

    public void buildTree(){
        /*
                         1
                 2               6
           3    4    5        7     8
        9

        DF (preorder): one, two, three, nine, four, five, six, seven, eight
        BF: one, six, two, eight, seven, five, four, three, nine (wacky order but it is still BF...)
        */

        // The order that we add elements to the list of children defines how they will be popped of the stack
        one.children.add(six);
        one.children.add(two);
        two.children.add(five);
        two.children.add(four);
        two.children.add(three);
        three.children.add(nine);
        six.children.add(eight);
        six.children.add(seven);

    }

    public ArrayList<Node> getChildren(Node node){
        return node.children;
    }

}
