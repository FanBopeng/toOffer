package array2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/3 20:45
 * @Description:  从后往前,先计算出需要的空间,然后从后往前移动,则每个字符只移动一次,这样效率更高一些
 */
public class String2 {


    public String replaceSpace(StringBuffer str){
         int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '){

                count++;
            }
        }

       int indexold=str.length()-1;                   //indexold为为替换前的str下标
        int newlength=count*2+str.length();                 //计算空格转换成%20之后的str长度
       int indexnew=newlength-1;                //indexold为为把空格替换为%20后的str下标
        str.setLength(indexnew);                 //使str的长度扩大到转换成%20之后的长度,防止下标越界
        for (;indexold>=0&&indexold<newlength;--indexold){
                if (str.charAt(indexold)==' '){
                    str.setCharAt(indexnew,'0' );
                    str.setCharAt(indexnew,'2' );
                    str.setCharAt(indexnew,'%' );

                }else {

                    str.setCharAt(indexnew--,str.charAt(indexold) );

                }

        }
            return str.toString();
    }
}
