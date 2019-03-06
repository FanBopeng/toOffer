package sort;

/**
 * @author: fanbopeng
 * @Date: 2019/3/2 14:12
 * @Description:
 */
public class InsertionSort {


    public static  void insertionSort(int[] arr){

        if (arr==null||arr.length<2){

             return;
        }
        for (int i = 1; i <arr.length; i++) {       //当前考察的i位置上的数
            for (int j=i-1;j>=0&&arr[j]>arr[j+1];j--){

                swap(arr,j,j+1);


            }


        }


        }

    private static void swap(int[] arr, int j, int i) {

        int help=arr[i];
        arr[i]=arr[j];
        arr[j]=help;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,1,2};
        insertionSort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }


}
