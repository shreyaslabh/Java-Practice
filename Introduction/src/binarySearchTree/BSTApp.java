package binarySearchTree;


class Node{
	int data;
	Node left;
	Node right;
}

class BST{
	
	
	public Node createNewNode(int val) {
		
		Node a = new Node();
		
		a.data = val;
		a.left = null;
		a.right = null;
		
		return a;
		
	}
	
	public Node insert(Node node,int val) {
		
		if(node == null) {
			return createNewNode(val);
		}
		else if(val < node.data){
			node.left = insert(node.left,val);
		}
		else if(val > node.data) {
			node.right = insert(node.right,val);
		}
		
		return node;
	}
	
	public Node delete(Node node, int val) {
		
		if(node == null) {
			return null;
		}
		else if(val<node.data) {
			node.left = delete(node.left,val);
		}
		else if(val > node.data) {
			node.right = delete(node.right,val);
		}
		else {
			if(node.left == null || node.right == null) {
				Node temp = null;
				temp = node.left==null?node.right:node.left;
				
				if(temp == null) {
					return null;
				}
				else {
					return temp;
				}
				
				
			}
			else {
				Node successor = getSuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right,successor.data);
				return node;
			}
		}
		return node;
	}
	
	public Node getSuccessor(Node node) {
		
		if(node == null) {
			return null;
		}
		else {
			Node temp = node.right;
			
			while(temp.left!=null) {
				temp = temp.left;
			}
			return temp;
		}
	}
	
	public void inorder(Node node) {
		
		if(node == null) {
			return;
		}
		
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
		
		
	}
	
}

public class BSTApp {

	public static void main(String[] args) {
		

		BST  a = new BST();
		
		Node root = null;
		
		//8,3,6,10,4,7,1,14,13
		
		root = a.insert(root, 8);
		root = a.insert(root, 3);
		root = a.insert(root, 6);
		root = a.insert(root, 10);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 1);
		root = a.insert(root, 14);
		root = a.insert(root, 13);
		
		
		a.inorder(root);
		
		a.delete(root, 8);
		
		System.out.println();
		a.inorder(root);

	}

}
