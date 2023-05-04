
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class rightView {
    public static TreeNode BST(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left=BST(root.left,val);
        }
        else if(val>root.val){
            root.right=BST(root.right,val);
        }
        return root;

    }
    public static void preorder(TreeNode root,int level,Map<Integer,Integer> map){
        if(root==null){
            return;
        }
        if(!map.containsKey(level)){
            map.put(level,root.val);
        }
        preorder(root.right,level+1,map);
        preorder(root.left,level+1,map);
    } 
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            Map<Integer,Integer> map=new HashMap<>();
            int n=sc.nextInt();
            TreeNode root=null;
            for(int i=0;i<n;i++){
                root=BST(root,sc.nextInt());
            }
            preorder(root,1,map);
            for(int i : map.keySet()){
                System.out.print(map.get(i)+" ");
            }
        }
    }
}
