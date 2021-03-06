package LinkedList;

public class AddElementsTail {

	public static void main(String args[]) {
		Node list = null;
		int arr[] = { 4, 2, 3, 4, 1 };
		for (int i = 0; i < arr.length; i++) {
			list = Insert(list, arr[i]);
		}
		printElements(list);
	}

	static Node Insert(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
			return head;
		} else {
			Node newList = head;
			while (head.next != null) {
				head = head.next;
			}
			head.next = node;
			return newList;
		}
	}

	static void printElements(Node list) {
		if (list == null) {
			System.out.print(list.data + " -> ");
		} else {
			while (list != null) {
				System.out.print(list.data + " -> ");
				list = list.next;
			}
		}
	}
}
