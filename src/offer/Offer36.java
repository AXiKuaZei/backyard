package offer;

import java.util.*;

import utils.Node;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。
 * 要求不能创建任何新的节点，只能调整树中节点指针的指向。
 * class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
 */
public class Offer36 {
    public static void main(String[] args) {
        System.out.println("x");
    }

    public Node treeToDoublyList(Node root){
        List<Node> li = new ArrayList<>();
        if(root == null) return null;
        // mid 1 or 2 method
        mid2(li,root);
        Node dummy = new Node();
        Node curr = dummy;
        for(Node node:li){
          curr.right = node;
          node.left = curr;
          curr = node;  
        }
        curr.right = dummy.right;
        dummy.right.left = curr;
        return dummy.right;
    }


    /**
     *   Inorder Traversal 
     *   Recursive
     */
    public void mid(List<Node> li, Node root){
        if(root.left!=null) mid(li,root.left);
        li.add(root);
        if(root.right!=null) mid(li,root.right);
    }


    /**
     *   Inorder Traversal 
     *   use a stack
     */
    public void mid2(List<Node> li, Node root){
        Deque<Node> stack = new LinkedList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            while(root.left!=null){
                stack.push(root);
                root = root.left;
            }
            while(!stack.isEmpty()){
                Node temp = stack.pop();
                li.add(temp);
                if(temp.right!=null){
                    root = temp.right;
                    break;
                }
            }
        }

    }


}