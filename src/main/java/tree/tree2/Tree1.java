package tree.tree2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/6 20:09
 * @Description:输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Tree1 {


        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            boolean flag=false;
            if (root1!=null&&root2!=null){
                if (root1.val==root2.val){

                    flag=check(root1,root2);



                }
                if (!flag){

                  HasSubtree(root1.left,root2 );

                }
                if (!flag) {

                    HasSubtree(root1.right, root2);

                }

            }


            return flag;



    }

    private boolean check(TreeNode root1, TreeNode root2) {
            if (root2==null){

                return true;
            }
            if (root1==null){

                return false;

            }
            if (root1.val!=root2.val){

                return false;
            }

            return   HasSubtree(root1.left,root2.left )&&HasSubtree(root1.right,root2.right );


    }

}
