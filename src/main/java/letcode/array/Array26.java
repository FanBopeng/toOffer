package letcode.array;

/**
 * @author: fanbopeng
 * @Date: 2019/3/1 19:24
 * @Description:
 */
public class Array26 {


    public  static int removeDuplicates(int[] nums) {
        int size=nums.length;

        for (int i = 1; i <size ; i++) {
            if (nums[i]==nums[i-1]){
                for (int j = i+1; j <size ; j++) {

                    nums[j-1]=nums[j];

                }
                size--;
                i--;



            }

        }

        return size;



    }


    public static void main(String[] args) {
        int nums[]={1,1,2};

        System.out.println(removeDuplicates(nums));

    }
}
