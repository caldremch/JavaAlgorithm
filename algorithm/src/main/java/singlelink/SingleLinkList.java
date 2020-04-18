package singlelink;

/**
 * Created by Caldremch on 2019/11/8.
 * 增删改查
 */
public class SingleLinkList {

	private ListNode head;

	public ListNode getHead() {
		return head;
	}

	public SingleLinkList() {
		this.head = null;
	}

	//插入链表
	public void insert(int data) {
		ListNode b = new ListNode();
		b.data = data;

		if (head == null){
			head = b;
			return;
		}

		ListNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = b;
	}

	//显示链表
	public void show(){
		ListNode listNode = head;
		while (listNode != null){
			System.out.print(listNode.data+" ");
			listNode = listNode.next;
		}
		System.out.println("");

	}

	//
	public  void reverse(){

	}

	public static void main(String[] args) {
		SingleLinkList singleLinkList = new SingleLinkList();
		singleLinkList.insert(1);
		singleLinkList.insert(2);
		singleLinkList.insert(3);
		singleLinkList.show();
	}
	
}


