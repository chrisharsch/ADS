package treee;

public class Node {
	int value;
	Node right;
	Node left;
	public Node(int v){
		value=v;
		left=right=null;
	}
	public Node getleft(){
		return left;
	}
	public Node getright(){
		return right;
	}
}

