package sort.sort2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/4 19:49
 * @Description:
 */
public class InsertionSort {



    public void insertionSort(int[] arr){
        if (arr==null||arr.length<2){


            return;
        }
        for (int i=1;i<arr.length;i++){
            for (int j = i; j>=0&&arr[j]>arr[j+1] ; j++) {


                swap(arr,j,j+1);
            }


        }








    }
    private static void swap(int[] arr, int i, int minIndex) {

        int help=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=help;


    }


}
