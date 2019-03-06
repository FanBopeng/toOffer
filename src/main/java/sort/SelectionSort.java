package sort;

/**
 * @author: fanbopeng
 * @Date: 2019/3/2 13:51
 * @Description:
 */
public class SelectionSort {


    public static  void selectionSort(int[] arr){
        if (arr==null||arr.length<2){

            return;
        }
        for (int i = 0; i < arr.length; i++) {

            int minIndex=i;
            for (int j = i+1; j <arr.length ; j++) {

                minIndex=arr[j]<arr[minIndex]? j:minIndex;

            }

            swap(arr,i,minIndex);


        }






    }

    private static void swap(int[] arr, int i, int minIndex) {

        int help=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=help;


    }

    public static void main(String[] args) {
        int[] a={1,2,3,1,2};
        selectionSort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }



}
