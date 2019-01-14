/**
 * @author: fanbopeng
 * @Date: 2019/1/13 11:08
 * @Description:
 * 数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字
 * 。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 */
public class Array29 {


    public  int MoreThanHalfNum_Solution(int [] array) {
        int count=0;

        for (int end=array.length-1;end>0;end--){

            for (int i=0;i<end;i++){
                    if (array[i]>array[i++]){
                        swap(array, i, i++);
                    }
            }
        }

        int middle=array[(0+array.length)/2];
        for (int i=0;i<array.length;i++){
            if (middle==array[i]){

                count++;
            }

        }
        if (count>array.length/2){

            return 2;
        }

        return 0;




    }

    private  void swap(int[] arr, int i, int j) {

        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



}
