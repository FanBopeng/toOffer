package string;

/**
 * @author: fanbopeng
 * @Date: 2019/1/15 10:02
 * @Description:请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
问题1：替换字符串，是在原来的字符串上做替换，还是新开辟一个字符串做替换！
问题2：在当前字符串替换，怎么替换才更有效率（不考虑java里现有的replace方法）。
从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点。
 *
 *
 *
 */
public class String4 {


    public static   String replaceSpace2(StringBuffer str){

        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' ') {

                count++;
            }

        }

      int indexold=str.length()-1;
       int newlength=str.length()+count*2;
       int newindex=newlength-1;
       str.setLength(newlength);
       for (;indexold>0;--indexold){
           if (str.charAt(indexold)==' '){
                str.setCharAt(newindex--,'0' );
                str.setCharAt(newindex--,'2');
                str.setCharAt(newindex--,'%' );
           }else {
               str.setCharAt(newindex--,str.charAt(indexold) );
           }

       }

       return str.toString();
    }


    public static void main(String[] args) {


        StringBuffer str=new StringBuffer(" 123 123");

        System.out.println(replaceSpace2(str));


    }



}
