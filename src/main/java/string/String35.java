package string;

import java.util.*;

/**
 * @author: fanbopeng
 * @Date: 2019/1/30 20:09
 * @Description:题目描述
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class String35 {


    public static   int FirstNotRepeatingChar(String str) {
        if (str==null||str.length()==0){
            return -1;


        }

        List<Character> list=new ArrayList<>();
        List<Character> list1=new ArrayList<>();
         char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){


            if (!list.contains(chars[i])&&!list1.contains(chars[i])){
                    list.add(Character.valueOf(chars[i]));
            }else {

                list.remove(Character.valueOf(chars[i]));
                list1.add(Character.valueOf(chars[i]) );
            }
        }
        if (list!=null){

            return str.indexOf(list.get(0));
        }


        return -1;
    }
    public   static int FirstNotRepeatingChar1(String str) {
        if(str.length()==0||str==null){
            return -1;
        }
        List<Character> lista = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!lista.contains(ch)){
                lista.add(Character.valueOf(ch));
            }else{
                lista.remove(Character.valueOf(ch));

            }
        }
        if(lista.size()<=0){
            return -1;
        }
        return str.indexOf(lista.get(0));
    }


    public static void main(String[] args) {



        String str= "googgle";

        System.out.println(FirstNotRepeatingChar(str));


    }

}
