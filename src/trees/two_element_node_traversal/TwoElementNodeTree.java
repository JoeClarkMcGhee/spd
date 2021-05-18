package trees.two_element_node_traversal;


public class TwoElementNodeTree {

    public class Node {

        Node left = null;
        Node right = null;
        String name;

        Node(String name){
            this.name= name;
        }
    }

    Node one   = new Node("one");
    Node two   = new Node("two");
    Node three = new Node("three");
    Node four  = new Node("four");
    Node five  = new Node("five");
    Node six   = new Node("six");
    Node seven = new Node("seven");
    Node eight = new Node("eight");

    public Node getRoot(){
        buildTree();
        return one;
    }

    public void buildTree(){
        /*
                     1
                2        3
             4     5         7
          6                8

          DF (preorder): 1, 2, 4, 6, 5, 3, 7, 8
          BF: 1, 2, 3, 4, 5, 7, 6, 8
         */
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        four.left = six;
        three.right = seven;
        seven.left = eight;
    }
}
