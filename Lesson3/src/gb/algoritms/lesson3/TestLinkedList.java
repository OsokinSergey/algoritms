package gb.algoritms.lesson3;

public class TestLinkedList {
		public static void main(String[] args) {
		
			LinkedList linkedList = new LinkedList();
			linkedList.add(0);
			linkedList.add(1);
			linkedList.add(2);
			linkedList.add(3);
			linkedList.add(4);
			linkedList.add(5);
			
			System.out.println("Исходный список");			
			printLinkList(linkedList);
			linkedList.reverse();
			System.out.println("Оборотный список");
			printLinkList(linkedList);
		}	
	
		private static void printLinkList(LinkedList ll) {
			LinkedList.LinkedListNode node = ll.head;
			while(node.next != null) {
				System.out.println(node.data);
				node=node.next;
			}	
			System.out.println(node.data);
	}
		
}	
		

		