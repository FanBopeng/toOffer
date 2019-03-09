package array;

import java.util.ArrayList;

/**
 * @author: fanbopeng
 * @Date: 2019/3/7 12:31
 * @Description:输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 */
public class ArrayJu {


    public ArrayList<Integer> printMatrix(int [][] array) {


        ArrayList<Integer> result=new ArrayList<>();
        if (array.length==0){

            return result ;
        }
        int n=array.length;
        int m=array[0].length;
        if (m==0){
            return result;
        }


        return null;

    }

}
