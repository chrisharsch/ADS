package liste;



public class liste {
		Node root =new Node(null);
		public liste(){
		}
		public liste(Object value){
			Node root= new Node(value);
			root.next = new Node(null);
		}
		public void printList() {
			Node c = root;
			while(c.next != null){
				System.out.println(c.value);
				c=c.next;
			}
		}
		public int length() {
			Node c = root;
			int i=0;
			if(root!=null){
				while(c.next!=null){
					i++;
					c=c.next;
				}
				return i;
			}
			return -1;
		}
		public boolean isEmpty(){
			if(root==null){
				return true;
			}
			return false;
		}
		public void removelast(){
			Node c = root;
			while(c.next!=null){
				c=c.next;
			}
			c=null;
		}
		public void addlast(Object v){
			if (root.value == null) {
				root.value = v;
			} else {
				Node c = new Node(v);
				Node node = this.getLast();
				node.setNext(c);
			}
		}
		public Node getLast(){
			return root;
		}
		public void addFirst(Object v){
			Node c = new Node(v);
			c.next=root;
			c=root;
		}
		
		public static void main(String[] args){
			System.out.println("hallo");
			liste list = new liste(12);
			list.addlast(13);
			list.printList();
		}
}
