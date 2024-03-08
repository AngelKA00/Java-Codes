package BasicPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SimpleLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLinkedList list = new SimpleLinkedList();
        list.insert(3);
        list.insert(7);
        list.insert(12);
        list.display();

	}

}
