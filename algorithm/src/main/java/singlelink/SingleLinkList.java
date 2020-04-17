package singlelink;

/**
 * Created by Caldremch on 2019/11/8.
 * 增删改查
 */
public class SingleLinkList {

	private Node head;

	public SingleLinkList() {
		this.head = null;
	}

	public void insert(int data) {
		Node b = new Node();
		b.data = data;
//		b.next = head;
//
//		head = b;
		if (head == null){
			head = b;
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = b;
	}

	public void show(){
		Node node = head;
		while (node != null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}

	public void delete(int i) {

	}

	public Node get(int i) {
		return null;
	}

	public void add(Node node) {

	}

	public static void main(String[] args) {
		SingleLinkList singleLinkList = new SingleLinkList();
		singleLinkList.insert(1);
		singleLinkList.insert(2);
		singleLinkList.insert(3);
		singleLinkList.show();
		singleLinkList.show();
	}
	
}


