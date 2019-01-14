/**
 * @author: fanbopeng
 * @Date: 2019/1/13 14:38
 * @Description:
 */
public class MergeSort {

    public  static void mergeSort(int[] arr){

        if (arr==null||arr.length<2){

            return;
        }
        sortProcess(arr,0,arr.length-1);

    }

    private static void sortProcess(int[] arr, int L, int R) {
        if (L==R){

            return;
        }
        int mid=(R+L)/2;
        sortProcess(arr, L, mid);
        sortProcess(arr, mid+1, R);
        merge(arr,L,mid,R);
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        //两个都没有越界
        while (p1 <= m && p2 <= r) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        //两个必有一个越界 下面两个排序只会发生一个
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }


    public static void main(String[] args) {

        int[] nums={1,3,2,6};

        mergeSort(nums);
        for (int i=0;i<nums.length;i++){

            System.out.println(nums[i]);

        }



    }
}
