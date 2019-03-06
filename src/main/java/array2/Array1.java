package array2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/3 20:25
 * @Description:  从右上角或者左下角开始打印
 */
public class Array1{

    public  static boolean Find(int target, int [][] array) {

      int row=0;
      int colSize=array[0].length-1;
      while (row<=array.length-1&&colSize>=0){
          if (target<array[row][colSize]){

              colSize--;

          }else if (target>array[row][colSize]){

              row++;
          }else {

              return true;
          }


      }

      return false;

    }


    public static void main(String[] args) {


        int [][]  ar={{1,2},{2,3}};
        System.out.println(Find(1, ar));


    }


}
