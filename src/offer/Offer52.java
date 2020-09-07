package offer;

import java.util.HashSet;

import utils.ListNode;

/**
 * 输入两个链表，找出它们的第一个公共节点。
 * 
 * 如下面的两个链表：
 * listA = [4,1,8,4,5], listB = [5,0,1,8,4,5] 8为相交
 */

public class Offer52 {
    public static void main(String[] args){
        ListNode ln8 = new ListNode(8);
        ln8.next = new ListNode(4);
        ln8.next.next = new ListNode(5);
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = ln8;
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = ln8;
        System.out.println(getIntersectionNode(headA, headB).val);

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        HashSet<ListNode> hs = new HashSet<>();
        while(currA!=null || currB!=null){
            if(currA!=null && hs.contains(currA)){
                return currA;
            }
            hs.add(currA);
            if(currB!=null && hs.contains(currB)){
                return currB;
            }
            hs.add(currB);
            currA = currA==null?null:currA.next;
            currB = currB==null?null:currB.next;
        }
        return null;
    }
    
}
