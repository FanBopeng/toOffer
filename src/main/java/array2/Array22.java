package array2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: fanbopeng
 * @Date: 2019/3/14 16:26
 * @Description:数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Array22 {

    public  static int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int count=0;

        for (int i = 0; i <array.length ; i++) {
                if (array[i]==array[array.length/2]){

                count++;

                }


        }
        if (count>array.length/2){
            return array[array.length/2];


        }else {

            return 0;
        }


    }

    public static void main(String[] args) {

        int[] arrar={1,2,2,2,2,4,5};


        System.out.println(arrar.length/2);
        System.out.println(MoreThanHalfNum_Solution(arrar));




    }


}
