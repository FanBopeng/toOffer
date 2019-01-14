import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: fanbopeng
 * @Date: 2019/1/13 11:54
 * @Description:输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 *
 *
 *
 *
 *
 */
public class Array30 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        Arrays.sort(input);

        ArrayList<Integer> list=new ArrayList<Integer>();
        if (k>input.length){

            return  new ArrayList<Integer>();
        }


        for (int i=0;i<k;i++){

            list.add(input[i]);

        }


        return list;

    }




}
