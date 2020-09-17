
import java.util.*;

/**
  5
  1 1 2 3
  2 4 -1 -1
  3 2 -1 4
  4 5 -1 5
  5 3 -1 -1
 */
public class Hello {

    int a = 11;
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        HashMap<Integer, Node> hm = new HashMap<>();
        int[][] memo = new int[n][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                memo[i][j]=sn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            hm.put(memo[i][0], new Node(memo[i][1]));
        }
        for(int i=0;i<n;i++){
            hm.get(memo[i][0]).left = memo[i][2]==-1?null:hm.get(memo[i][2]);
            hm.get(memo[i][0]).right = memo[i][3]==-1?null:hm.get(memo[i][3]);
        }
        System.out.println(inOrder(hm.get(1)));

    }

    public static int inOrder(Node node){
        if(node == null) {
            return Integer.MIN_VALUE;
        }
        int temp = node.val;
        int max = temp;
        Node curr = node;
        while(curr.left!=null){
            temp^=curr.left.val;
            max= Math.max(max,temp);
            curr=curr.left;
        }
        temp = node.val;
        curr = node;
        while(curr.right!=null){
            temp^=curr.right.val;
            max= Math.max(max,temp);
            curr=curr.right;
        }
        return Math.max(Math.max(max,inOrder(node.left)),inOrder(node.right));
    }


    private static class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int _val) {
            val = _val;
        }
    }
}