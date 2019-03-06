package alphabetorder;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @author: fanbopeng
 * @Date: 2019/3/1 11:42
 * @Description:输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Alphabet {

    public  static ArrayList<String> Permutation(String str) {


        ArrayList<String> list=new ArrayList<>();
        if (str!=null&&str.length()>0){
            PermutationHepler(str.toCharArray(),0,list);
            Collections.sort(list);


        }

        return  list;


    }

    private static void PermutationHepler(char[] chars, int i, ArrayList<String> list) {

        if (i==chars.length-1){

            String val=String.valueOf(chars);
            if (!list.contains(val)) {

                list.add(val);
            }
            }else {
                for (int j=i;j<chars.length;j++){
                    swap(chars, i,j);
                    PermutationHepler(chars,i+1 ,list );
                    swap(chars,i,j);
                }

            }





    }

    private static  void swap(char[] chars, int i, int j) {
        char help=chars[i];
          chars[i]=chars[j];
          chars[j]=help;



    }


    public static void main(String[] args) {

        String abc="abc";
        Alphabet.Permutation(abc);

    }


}
