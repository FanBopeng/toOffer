package string;

import java.awt.event.MouseListener;

/**
 * @author: fanbopeng
 * @Date: 2019/2/28 12:58
 * @Description:请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * ]在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class String1 {

    public static   boolean match(char[] str, char[] pattern) {
       if (str==null||pattern==null){

           return false;
       }

       int strIndex=0;
       int patternIndex=0;
       return matchCore(str,strIndex , pattern,patternIndex );

    }

    public static   boolean matchCore(char[] str,int strIndex, char[] pattern,int patternIndex) {
        if (strIndex==str.length&&patternIndex==pattern.length){

            return true;

    }
    //pattern先到尾
        if (strIndex<str.length&&patternIndex==pattern.length){

            return false;
        }
        //模式第2个是*,且字符串第1个跟模式第1个匹配,分三种情况,如不匹配,模式后移两位
        if (patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*'){
            if (strIndex!=str.length&&pattern[patternIndex]==str[strIndex]||(pattern[patternIndex]=='.'&&strIndex!=str.length)){

                return matchCore(str, strIndex, pattern, patternIndex+2)||  //模式后移两位
                matchCore(str, strIndex+1,pattern ,patternIndex+2 )|| //视为模式匹配一个字符
                matchCore(str,strIndex+1 , pattern, patternIndex);


            }else {

                return matchCore(str,strIndex , pattern,patternIndex+2 );
            }

            //如果模式第二个不是*,且字符串第一个跟模式第一个匹配,则都后移一位,否则直接返回false
        }
        if (strIndex!=str.length&&str[strIndex]==pattern[patternIndex]){

            return matchCore(str, strIndex+1, pattern, patternIndex+1);
        }
            return false;
    }


    public static void main(String[] args) {

             char[] str={'a','a','a'};
             char[] pattern={'a','.','.'};
        System.out.println(match(str, pattern));

    }
}
