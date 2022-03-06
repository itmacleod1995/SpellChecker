
public class BinarySearchTree<T extends Comparable<T>> {
	
	private class Node {
		private T data;
		private Node left;
		private Node right;
		
		public Node(T data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(T val) {
		root = insertAt(root, val);
	}
	
	private Node insertAt(Node rt, T val) {
		if(rt == null) {
			return new Node(val);
		}else if(rt.data.compareTo(val) > 0) {
			//left
			rt.left = insertAt(rt.left, val);
		}else if(rt.data.compareTo(val) < 0) {
			rt.right = insertAt(rt.right, val);
		}
		
		return rt;
	}
	
	public T find(T val) {
		Node n = findAt(root, val);
		if(n == null) return null;
		
		return n.data;
	}
	
	private Node findAt(Node rt, T val) {
		if(rt == null) return null;
		
		if(rt.data.compareTo(val) < 0) {
			return findAt(rt.right, val);
		}else if(rt.data.compareTo(val) > 0) {
			return findAt(rt.left, val);
		}else {
			return rt;
		}
	}

}
