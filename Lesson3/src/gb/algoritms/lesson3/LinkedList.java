package gb.algoritms.lesson3;

public class LinkedList {
	
	class LinkedListNode {
	    int data;
	    LinkedListNode next;
	}
	
	LinkedListNode head;
    // метод добавления нового элемента в список
    public void add(int data) {
        LinkedListNode node = new LinkedListNode();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            LinkedListNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    // метод обращения списка 
    public void reverse() {
        LinkedListNode previos = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previos;
            previos = current;
            current = next;
        }
       head = previos;
    }
}