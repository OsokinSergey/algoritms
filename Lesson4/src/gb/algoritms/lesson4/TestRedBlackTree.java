package gb.algoritms.lesson4;

public class TestRedBlackTree {
	
	public static void main(String[] args){
		RedBlackTree<Integer> tree = new RedBlackTree<>();
		tree.insert(5);
		tree.insert(3);
		tree.insert(7);
		tree.insert(2);
		tree.insert(4);
		tree.insert(6);
		tree.insert(8);

		System.out.println(tree.contains(5)); 
		System.out.println(tree.contains(10));
		System.out.println(tree.contains(21));
		System.out.println(tree.contains(6));
	}

}
