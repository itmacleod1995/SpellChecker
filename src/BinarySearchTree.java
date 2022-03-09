/**
 * Binary Search Tree class
 * @author Ian MacLeod
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> {
	
	/**
	 * Node class
	 * @author Ian MacLeod
	 *
	 */
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
	
	//instance variable
	private Node root;
	
	/**
	 * Default Constructor
	 */
	public BinarySearchTree() {
		root = null;
	}
	
	/**
	 * public method that inserts value into tree
	 * @param val value to insert
	 */
	public void insert(T val) {
		root = insertAt(root, val);
	}
	
	/**
	 * private helper method that adds a value into the tree
	 * @param rt root of tree
	 * @param val value to be inserted
	 * @return root
	 */
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
	
	/**
	 * public method that calls the find helper method
	 * @param val value to find in tree
	 * @return value of node
	 */
	public T find(T val) {
		Node n = findAt(root, val);
		if(n == null) return null;
		
		return n.data;
	}
	
	/**
	 * private helper method that finds a value in the tree
	 * @param rt root
	 * @param val value to find
	 * @return root
	 */
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
	
	/**
	 * public method that calls the height helper method
	 * @return height of tree
	 */
	public int height() {
		int height = findHeight(root);
		return height;
	}
	
	/**
	 * method that finds the height of a tree
	 * @param rt root
	 * @return height of tree
	 */
	public int findHeight(Node rt) {
		if(rt == null) return 0;
		
		return Math.max(findHeight(rt.left) + 1, findHeight(rt.right) + 1);
	}

}
