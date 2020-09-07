package offer;

import utils.Node;

/**
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * 
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 
 * 3 / \ 9 20 / \ 15 7 返回它的最大深度 3 。
 * 
 */
public class Offer55 {
    public static void main(String[] args){
        
    }

    public static int maxDepth(Node root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
    
}
