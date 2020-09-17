
public class Huawei {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);

        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);
//        b.next.next.next = new ListNode(8);

        ListNode res = add(a, b);
        print(res);
    }


    public static ListNode add(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode curr1 = a;
        ListNode curr2 = b;

        int v1 = 0;
        int v2 = 0;
        while(curr1!=null){
            v1 = v1*10+curr1.val;
            curr1 = curr1.next;
        }
        while(curr2!=null){
            v2 = v2*10+curr2.val;
            curr2 = curr2.next;
        }
        System.out.println("a=" + v1);
        System.out.println("b=" + v2);
        int sum = v1+v2;
        System.out.println(sum);
        while(sum>0){
            curr.next = new ListNode(sum%10);
            sum/=10;
            curr=curr.next;
        }
        return dummy.next;
    }

    public static void print(ListNode a){
        ListNode curr = a;
        while(curr!=null){
            System.out.print(curr.val + " ");
            curr=curr.next;
        }
    }

    private static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }
}

