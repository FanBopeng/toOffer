package tree;

import link.Test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: fanbopeng
 * @Date: 2019/3/7 13:06
 * @Description:从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Tree3 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

      ArrayList<Integer> list =new ArrayList<>();
      ArrayList<TreeNode> queue=new ArrayList<>();

      if (root==null){


          return list;
      }


      queue.add(root);
      while (queue.size()!=0){

          TreeNode tmp = queue.remove(0);
          if (tmp.left!=null){

              queue.add(tmp.left);

          }
          if (tmp.right!=null){

              queue.add(tmp.right);
          }

          list.add(tmp.val);


      }

      return list;

    }

}
