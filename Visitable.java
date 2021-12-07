//This interface is used to demonstrate the visitor design pattern
public interface Visitable<T>
{
    Node findRoot(Node node);
    int sumOfLeaves(Node node);
    int sumOfNodes(Node node);
}