package array2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/5 10:30
 * @Description:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分， 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 * <p>
 * 整体思路：
 * 首先统计奇数的个数
 * 然后新建一个等长数组，设置两个指针，奇数指针从0开始，偶数指针从奇数个数的末尾开始 遍历，填数
 */
public class Array14 {


    public void reOrderArray(int[] array) {

        if (array.length < 2) {

            return;
        }
        int oddCount = 0, oddBegin = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            if ((array[i] & i) == 1) {

                oddCount++;
            }

        }
        for (int i = 0; i < array.length; i++) {

            if ((array[i] & 1) == 1) {

                newArray[oddBegin++] = array[i];
            } else {

                newArray[oddCount++] = array[i];
            }

            for (int j = 0; j < array.length; j++) {
                array[i] = newArray[i];
            }
        }

    }


    public void reOrderArray2(int[] array) {

        if (array.length < 2) {

            return;
        }
        for (int end = array.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (array[i] % 2 == 0 && array[i + 1] % 2 == 1) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;


                }


            }


        }


    }


}
