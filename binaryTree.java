import java.util.*;
class BinaryTree{
    int val;
    TreeNode left,right;
    BinaryTree(int val){
        this.val=val;
    }
    public static TreeNode BT(TreeNode root){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        if(val==-1)
            return root;
        root.left=BT(root.left);
        root.right=BT(root.right);
        return root;
    }
    public static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

}
public class binaryTree {
    public static void main(String[] args) {

        TreeNode root=null;
        root=BinaryTree.BT(root);

        BinaryTree.preorder(root);
    }
}
