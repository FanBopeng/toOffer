package niuke;

import java.util.HashMap;
import java.util.List;

/**
 * @author: fanbopeng
 * @Date: 2019/3/11 17:50
 * @Description:
 */
public class UnionFind {

    public static  class  Node{}


    public static class UnionFindSet{
        //前一个Node每一个节点   key:孩子  value :father
        public HashMap<Node,Node> fatherMap;
        //某一个节点 它所在的集合 有多少节点
        public HashMap<Node,Integer> sizeMap;


        public UnionFindSet(List<Node> nodes) {

            fatherMap=new HashMap<>();
            sizeMap=new HashMap<>();
            makeSets(nodes);


        }

        private void makeSets(List<Node> nodes){


            for (Node node:nodes){
                    fatherMap.put(node, node);
                    sizeMap.put(node,1 );

            }


        }

        public Node findHead(Node node){

            Node father = fatherMap.get(node);
            if (father!=null){

                father=  findHead(node);
            }
         return null;


        }

        public boolean isSameSet(Node a,Node b){

            return false;

        }

    }




}
