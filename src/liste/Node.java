package liste;

public class Node {
	Object value;
	Node next;
	
	public Node(Object value){
			this.value = value;
			next=null;
		}

	public Node getNext(){
		return this.next;
	}
	
	public Object getObjeckt(){
		return this.value;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
