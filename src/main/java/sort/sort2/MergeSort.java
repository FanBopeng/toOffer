package sort.sort2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/4 20:06
 * @Description:
 */
public class MergeSort {


    public void mergeSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        sortProcess(arr, 0, arr.length - 1);


    }

    private void sortProcess(int[] arr, int L, int R) {

        if (L == R) {

            return;
        }
        int mid = L + (L + R) / 2;
        sortProcess(arr, L, mid);
        sortProcess(arr, mid + 1, R);
        merge(arr, L, mid, R);


    }

    private void merge(int[] arr, int L, int mid, int R) {

        int[] help = new int[arr.length];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;

        while (p1 <= mid && p2 <= R) {

            help[i++] = arr[p1] >= arr[p2] ? arr[p1++] : arr[p2++];


        }
        while (p1 <= mid) {

            help[i++] = arr[p1++];

        }
        while (p2 < R) {

            help[i++] = arr[p2++];
        }

        for (int j = 0; j < help.length; j++) {

            arr[i] = help[i];

        }


    }

}
