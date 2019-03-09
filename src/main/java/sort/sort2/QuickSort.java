package sort.sort2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/7 16:25
 * @Description:
 */
public class QuickSort {


    public  static  void quickSort(int[] arr ){


        quickSort(arr,0,arr.length-1);



    }

    private static void quickSort(int[] arr, int L, int R) {
        if (L>R){
            return;

        }
        int base=arr[L];

        int i=L;
        int j=R;
        while (i!=j){
            while (arr[j]>=base&&i<j){

                j--;
            }
            while (arr[i]<=base&&i<j){
                i++;

            }

            swap(arr,i , j);

        }
        arr[L]=arr[i];
        arr[i]=base;


        quickSort(arr, L, i-1);
        quickSort(arr, j+1, R);






    }

    private static void swap(int[] arr, int i, int minIndex) {

        int help = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = help;


    }

    public static void main(String[] args) {

        int [] arr={14,2,3,1,2};
        quickSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);


        }

    }

}
