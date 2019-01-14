/**
 * @author: fanbopeng
 * @Date: 2019/1/13 10:12
 * @Description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * 思路
 *          1.维护头尾指针,头为偶数,尾为奇数的时候
 *
 *
 */
public class Offer14 {

    public static void reOrderArray(int [] array) {
      int i=0;
      int j=array.length-1;
      int temp=0;
      while (i<j){
      if (array[i]%2==1){
          i++;
          continue;

      }
      if (array[j]%2==0){

            j--;
          continue;
      }
          temp=array[i];
          array[i]=array[j];
          array[j]=temp;
          i++;
          j--;
      }

       for (int m=0;m<array.length;m++){

           System.out.println(array[m]);
       }
    }
    public static void reOrderArray2(int [] array){
        int[] copy=new int[array.length];
        int m=0;

        for (int i=0;i<array.length;i++){
            if (array[i]%2==1) {
                copy[m++] = array[i];

            }

        }
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0) {
                copy[m++] = array[i];

            }

        }
        for (int n=0;n<copy.length;n++){

           array[n]=copy[n];
        }


    }

    public static void main(String[] args) {



        int[] array={1,2,3,4,5,6,7};
        reOrderArray2(array);


    }


}
