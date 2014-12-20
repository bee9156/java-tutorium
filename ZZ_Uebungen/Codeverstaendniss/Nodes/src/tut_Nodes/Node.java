package tut_Nodes;

public class Node {
	
	Node Left = null;
	Node Right = null;
	
	int Weight = 0;
	
	public int getWeight(){
		if (Left == null) return Weight;
		int weight = Left.getWeight();
		if(Right == null) return weight;
		return Right.getWeight() + weight;
	}
	
	public void addNode(Node newNode){
		if (Left == null){
			Left = newNode;
			return;
		}
		if (Right == null){
			Right = newNode;
			return;
		}
		if (Left.getWeight() > Right.getWeight()){
			Right.addNode(newNode);
		} else {
			Left.addNode(newNode);
		}
	}
	
	public Node (int weight){
		Weight = weight;
	}

	public static void main(String[] args) {
		Node root = new Node(7);
		System.out.println(root.getWeight());
		root.addNode(new Node(6));
		System.out.println(root.getWeight());
		root.addNode(new Node(5));
		System.out.println(root.getWeight());
		root.addNode(new Node(4));
		System.out.println(root.getWeight());
		root.addNode(new Node(3));
		System.out.println(root.getWeight());
		root.addNode(new Node(2));
		System.out.println(root.getWeight());
		root.addNode(new Node(1));
		System.out.println(root.getWeight());
	}

}
