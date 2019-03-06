package sort;



/**
 * @author: fanbopeng
 * @Date: 2019/3/2 14:58
 * @Description:
 */
public class MergeSort {



    public static void mergeSort(int[] arr){

        if (arr==null||arr.length<2){


            return;
        }

        sortProcess(arr,0,arr.length-1);




    }

    private static void sortProcess(int[] arr, int L, int R) {
        if (L==R){

            return;
        }


        int mid=L+(R-L)/2;
        sortProcess(arr, L, mid);
        sortProcess(arr,mid+1 , R);
        merge(arr,L,mid,R);

    }

    private static void merge(int[] arr, int L, int mid, int R) {

        int[]  help= new int[R-L+1];
        int i=0;//依次在help中把每个数都填上
        int p1=L;   //左侧部分第一个数
        int p2=mid+1; //右侧部分第一个数
        while (p1<mid&&p2<=R){

            help[i]=arr[p1]<arr[p2]? arr[p1++]:arr[p2++];
            i++;
        }
        while (p1<=mid){

            help[i++]=arr[p2++];

        }
        while (p2<=mid){

            help[i++]=arr[p1++];
        }

        for (int j = 0; j <help.length ; j++) {

            arr[L+j]=help[j];

        }





    }

}
