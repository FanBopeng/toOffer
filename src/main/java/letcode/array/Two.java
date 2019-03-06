package letcode.array;

/**
 * @author: fanbopeng
 * @Date: 2019/3/1 18:23
 * @Description:给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class Two {

    public static   int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {

                return i;

            }



        }
        return nums.length;
    }


    public static void main(String[] args) {

         int nums[]={1,2,3,4,5};

         searchInsert(nums, 2);

    }

}
