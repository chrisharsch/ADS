package treee;
public class tree {
	Node root;

	public tree() {
		root = null;
	}

	public tree(int c) {
		root = new Node(c);
	}

	public tree(Node r) {
		root = r;
	}

	public tree bin(int c, tree s, tree t) {
		tree r = new tree(c);
		if (s == null) {
			r.root.left = null;
		} else {
			r.root.left = t.root;
		}
		if (t == null) {
			r.root.right = null;
		} else {
			r.root.right = t.root;
		}
		return r;
	}

	public void preorder() {

	}

	public boolean isEmpty() {
		return (root == null);
	}

	public int height(Node root) {
		int i = 0;
		while (root.left != null || root.right != null) {
			if (root.left != null) {
				root = root.left;
				i++;
			} else if (root.right != null) {
				root = root.right;
				i++;
			}
		}
		return i;
	}

	public void insert(int o) {
		Node tmp;
		Node prev;

		if (root == null) {
			root = new Node(o);
		} else {
			tmp = root;
			prev = root;
			while (tmp != null) {
				prev = tmp;
				if (o < tmp.value) {
					tmp = tmp.left;
				} else if (o > tmp.value) {
					tmp = tmp.right;
				} else {
					return;
				}
			}
			if (o < prev.value) {
				prev.left = new Node(o);
			} else if (o > prev.value) {
				prev.right = new Node(o);
			}
		}
	}
	public boolean search(int v){
		Node c = root;
		while(c!=null){
			if(c.value==v){
				return true;
			}else if(v<c.value){
				c=c.left;
			}else{
				c=c.right;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		tree t = new tree();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);
		t.insert(5);
		t.insert(6);
		System.out.println(t.search(2));
		
	}

}
