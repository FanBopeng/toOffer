package array;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: fanbopeng
 * @Date: 2019/1/14 13:50
 * @Description:
 */
public class Array40 {

    public  static boolean duplicate(int numbers[],int length,int [] duplication) {

        if (numbers==null){


            return false;
        }


        Map<Integer,Integer> map=new HashMap<>();


        for (int i=0;i<numbers.length;i++){
            if (map.containsKey(numbers[i])){
               map.put(numbers[i],map.get(numbers[i])+1 );


            }else {

                map.put(numbers[i],1 );
            }


        }
       for (Integer in:map.keySet()){

           Integer integer = map.get(in);
           if (integer>1) {
                duplication[0]=in;
               return  true ;
           }


       }


        return false;


    }

    public  static boolean duplicate1(int numbers[],int length,int [] duplication){
     int[] hash=new int[length];
     for (int i=0;i<length;i++){

         hash[numbers[i]]++;

     }
     for (int i=0;i<length;i++){

         if (hash[i]>1){
            duplication[0]=i;
            return true;

         }
     }

     return false;

    }


    public static void main(String[] args) {

        int[] nums={1,2,3,5,6,2,4};
        int len=nums.length;
        duplicate(nums, len, new int[2]);



    }

}
