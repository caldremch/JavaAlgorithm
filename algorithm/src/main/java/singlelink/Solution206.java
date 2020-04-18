package singlelink;

public class Solution206 {

    public ListNode removeNthFromEnd(ListNode head, int n){

        int totalCount = 0;
        ListNode temp = head;

        while (temp!=null){
            temp = temp.next;
            totalCount++;
        }

        int x = totalCount - n -1;

        if (x <= 0 ) return null;

        temp = head;
        while (x-->0){
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    public ListNode reverseList(ListNode head){

        //new head
        ListNode pre = null;
        ListNode temp = head;
        while (temp != null){
            ListNode theNext = temp.next;
            temp.next = pre;
            pre = temp;
            temp = theNext;
        }

        return pre;
    }

    public void show(ListNode head){
        ListNode listNode = head;
        while (listNode != null){
            System.out.print(listNode.data+" ");
            listNode = listNode.next;
        }
        System.out.println("");
    }



    public static void main(String[] args) {
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.insert(1);
        singleLinkList.insert(2);
        singleLinkList.insert(3);
        singleLinkList.insert(4);
        singleLinkList.insert(6);
        singleLinkList.insert(7);
        singleLinkList.show();
        Solution206 solution206 =  new Solution206();
//        ListNode listNode = solution206.reverseList(singleLinkList.getHead());
//        solution206.show(listNode);

        ListNode listNode1 = solution206.removeNthFromEnd(singleLinkList.getHead(), 7);
        solution206.show(listNode1);

    }
}
