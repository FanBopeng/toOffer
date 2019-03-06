package sort;

import java.security.PublicKey;

/**
 * @author: fanbopeng
 * @Date: 2019/3/2 17:12
 * @Description: 经典快排 数组中最后一个数  小于等于这个数的放在左边,  大于这个数的放在右边
 * 然后依次划分
 * 总是拿最后一个数去划分 跟数据状况有关系了 极端情况下就会退变成 on2
 * 随机快排
 * 在整个数组中随机选一个数 让他跟最后一个数交换,    nlogn  空间 Ologn
 * 归并排序  的需要遍历两遍 常数项高于快排
 */
public class QuickSort {


    public static void quickSort(int[] arr) {

        if (arr == null || arr.length < 2) {

            return;

        }
        quickSort(arr, 0, arr.length - 1);


    }

    private static void quickSort(int[] arr, int L, int R) {
        if (L < R) {

            swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0 ]-1);
            quickSort(arr, p[1] + 1, R);

        }

    }

    private static int[] partition(int[] arr, int L, int R) {

        int less = L - 1;
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);

            } else if (arr[L] > arr[R]) {

                swap(arr, --more, L);
            } else {
                L++;
            }


        }
        swap(arr, more, R);

        return new int[]{less + 1, more};


    }

    private static void swap(int[] arr, int i, int minIndex) {

        int help = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = help;


    }


    public static void main(String[] args) {

        int[] a = {1, 4, 3};
        quickSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }


}
