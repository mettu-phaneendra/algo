import java.util.List;
import java.util.ArrayList;

class MergeSortedLists {
 
    public ListNode mergeKLists(ListNode[] lists) {
        
        if (null == lists || lists.length == 0) {
            System.out.println("Empty or null lists");
            return null;
        }
        ListNode response = new ListNode(null);
        ListNode head = response;
        int size = lists.length;
        ListNode[] temp = new ListNode[size];
        Integer[] values = new Integer[size];
        for (int i = 0; i < size; i++) {
            temp[i] = lists[i];
        }
        markAndSweep(temp, response);
        return head;    
    }
    
    private void markAndSweep(ListNode[] temp, ListNode response) {
        Integer lowestIndex = null;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                if (null == lowestIndex) {
                    lowestIndex = i;
                } 
                if (temp[i].val < temp[lowestIndex].val) {
                     lowestIndex = i;                    
                }
            } 
        }
        if (null == lowestIndex) {
            return;
        }
        int value = temp[lowestIndex].val;
        //System.out.println("Value :" +value);
        temp[lowestIndex] = temp[lowestIndex].next;
        response.val = value;
        response.next = new ListNode(null);
        response = response.next;
        markAndSweep(temp, response);
    }
    
    
    public static void main(String[] argv) {
        MergeSortedLists lists = new MergeSortedLists();
        ListNode[] array = new ListNode[3];
        
        ListNode first =  new ListNode(1);
        first.next = new ListNode(8);
        first.next.next = new ListNode(12);
        ListNode second = new ListNode(4);
        second.next = new ListNode(14);
        second.next.next = new ListNode(24);
        ListNode third = new ListNode(-6);
        third.next = new ListNode(-1);
        
        array[0] = first;
        array[1] = second;
        array[2] = third;
        
        ListNode result = lists.mergeKLists(array);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
            if (result != null) System.out.print("->");
        }
        System.out.println();
        
    }
    
    static class ListNode {
        Integer val;
        ListNode next;
        ListNode(Integer x) { val = x; }
    }
    
}

/*

  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6

*/