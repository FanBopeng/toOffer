package letcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: fanbopeng
 * @Date: 2019/3/1 18:45
 * @Description:
 */
public class Array1 {

    public static   int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int com=target-nums[i];
            if (map.containsKey(com)){

                return new int[]{map.get(com),i};

            }
                map.put(nums[i], i);


        }

        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};

        System.out.println(twoSum(nums, 9).toString());
    }


}
