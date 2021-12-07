public class Main {
    public static void main(String[] args){
        //Order of insertion - [5,7,8,15,20,21,13,18,11,42]

        //Inserted first five values 5,7,8,15,20
        Node ob = new Node();
        Node firstNode = ob.createNode(5);
        Node secondNode = ob.createNode(7);
        Node thirdNode = ob.createNode(8, firstNode, secondNode);
        Node fourthNode = ob.createNode(15);
        Node fifthNode = ob.createNode(20, thirdNode, fourthNode);

        //Inserted second five values 21,13,18,11,42
        Node sixthNode = ob.createNode(21);
        Node seventhNode = ob.createNode(13);
        Node eighthNode = ob.createNode(18, sixthNode, seventhNode);
        Node ninthNode = ob.createNode(11, eighthNode, null);

        //Root
        Node root = ob.createNode(42, fifthNode, ninthNode);

        //Setting parents of the node manually
        firstNode.setParent(thirdNode);
        secondNode.setParent(thirdNode);
        thirdNode.setParent(fifthNode);
        fourthNode.setParent(fifthNode);
        sixthNode.setParent(eighthNode);
        seventhNode.setParent(eighthNode);
        eighthNode.setParent(ninthNode);
        ninthNode.setParent(root);
        fifthNode.setParent(root);

        Visitor visitor = new Visitor();
        //Providing any node in the tree we find the root and print its value
        System.out.println("Root is --> " + visitor.findRoot(firstNode).getNodeValue());
        //Providing public node we find sum of all the leaves
        System.out.println("Sum of all the leaves is --> " + visitor.sumOfLeaves(visitor.findRoot(firstNode)));
        //Providing public node we find sum of all the nodes
        System.out.println("Sum of all the nodes  is --> " + visitor.sumOfNodes(visitor.findRoot(firstNode)));

    }
}
