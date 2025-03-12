/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        LinkedHashSet<ListNode> cycle = new LinkedHashSet<>();
        ListNode current = head;
        while(current != null){
            if(cycle.contains(current)){
                return current;
            }
            cycle.add(current);
            current = current.next;
        }
        return null;
    }
    
}