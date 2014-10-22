package binary_tree;

public class Node {
	public Integer data;
	public Integer level;
	public Node leftChild;
	public Node rightChild;

	/*
	 * By Default instance references are initialized with null
	 */
	public Node(){
	}
	
	public Node(Integer data){
		this.data = data;
	}
	
	public Node(Integer data, Node leftChild, Node rightChild){
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	public Node(Integer data, Node leftChild, Node rightChild, Integer level){
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.level = level;
	}
	
	public String toString(){
		return data.toString();
	}
	
	public boolean isLeafNode(){
		return leftChild == null && rightChild == null;
	}
	
	public boolean hasLeftChild(){
		return leftChild != null;
	}
	
	public boolean hasRightChild(){
		return rightChild != null;
	}
	
	public boolean isComplete(){
		return leftChild != null && rightChild != null;
	}
}
