package offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.graalvm.compiler.graph.Node;

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
        Node dummy = new Node();
        if(root.left!=null){
            treeToDoublyList(root.left);
        }
        if(root.right!=null){
            treeToDoublyList(root.right);
        }
        return root;
    }

    public void mid2(List<Node> li, Node root){
        Deque<Node> stack = new LinkedList();
        while(stack.isEmpty()){
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


    class Node {
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
    }
}