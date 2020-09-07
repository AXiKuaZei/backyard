package offer;

import utils.Node;

/**
 * 给定一棵二叉搜索树，请找出其中第k大的节点。

输入: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
输出: 4

 */
public class Offer54 {
    public static void main(String[] args){
        Node root = new Node(3);
        root.left = new Node(1);
        root.left.right = new Node(2);
        root.right = new Node(4);
        System.out.println(kthLargest(root, 1));
    }

    public static int kthLargest(Node root, int k) {
        int[] no = {1,0};
        kthLargest(root, k, no);
        return no[1];
    }

    public static void kthLargest(Node root, int k, int[] no) {
        if(root==null || k==0){
            return;
        }
        kthLargest(root.right, k, no);
        if(no[0]++==k){
            no[1]=root.val;
            return;
        }
        kthLargest(root.left, k, no);
    }

}
