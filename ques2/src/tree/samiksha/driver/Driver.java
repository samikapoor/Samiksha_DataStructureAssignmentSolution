package tree.samiksha.driver;
import tree.samiksha.node.Node;

public class Driver {
	public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
	
	static void bstToSkewed(Node root, int order) {
		if(root == null){
			return;
		}

		if(order > 0) {
			bstToSkewed(root.right, order);
		} else {
			bstToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		
		if(headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			bstToSkewed(leftNode, order);
		} else {
			bstToSkewed(rightNode, order);
		}
	}
	
	static void skewedRightFunc(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        skewedRightFunc(root.right);       
    }
	
	public static void main (String[] args) {
		Driver tree = new Driver();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(55);
       
        int order = 0;
        bstToSkewed(node, order);
        skewedRightFunc(headNode);
    }
}
