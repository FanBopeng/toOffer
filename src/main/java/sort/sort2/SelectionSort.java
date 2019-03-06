package sort.sort2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/4 19:30
 * @Description:
 */
public class SelectionSort {


    public void selectionSort(int[] arr){

        if (arr.length<2||arr==null){

            return;
        }
        for (int i = 0; i < arr.length; i++) {

            int mid=i;
            for (int j = i+1; j <arr.length ; j++) {

                mid=arr[j]<arr[mid]? j :mid;

            }

            swap(arr,mid,i);


        }






    }

    private static void swap(int[] arr, int i, int minIndex) {

        int help=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=help;


    }

}
