public class Node //Generic to make it accept Integer, Character, Double, Anything
{
    private int nodeValue; // node's value
    private Node left, right, parent; // subtree reference
    // create instance with a value and null subtrees
    public Node(int item)
    {
        nodeValue = item;
        left = right = parent = null;
    }

    public Node(){ //for initial case

    }

    // initialize the value and the subtrees
    public Node (int item, Node left, Node right)
    {
        nodeValue = item;
        this.left = left;
        this.right = right;

    }

    //sugar for creating nodes rather than following default constructor, saves writing new multiple times
    public Node createNode(int item, Node left, Node right){
        return new Node(item, left, right);
    }
    //overloading for single parameter
    public Node createNode(int item){
        return new Node(item, left, right);
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}