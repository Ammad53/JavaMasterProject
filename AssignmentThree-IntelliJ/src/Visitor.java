//This class implements the functionality of the visitorInterface
public class Visitor<T> implements Visitable<T>
{
    //Method to find the root of the tree, from any given node
    public Node findRoot(Node node) {
        while (true) {
            if (node != null && node.getParent() != null) {
                node = findRoot(node.getParent());

            } else {
                break;
            }
        }
        return node;
    }

    //Method to find sum of all the leaves of the tree
    public int sumOfLeaves(Node node) {
        if(node != null) {
            if(node.getLeft() != null || node.getRight() != null) {
                return sumOfLeaves(node.getLeft()) + sumOfLeaves(node.getRight());
            }
            else {
                return node.getNodeValue();
            }
        }
        else {
            return 0;
        }
    }

    //Method to find sum of all the nodes of the tree
    public int sumOfNodes(Node node){
        if(node != null)
            return node.getNodeValue() + sumOfNodes(node.getLeft()) + sumOfNodes(node.getRight());
        return 0;
    }


}