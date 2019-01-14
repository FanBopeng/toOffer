/**
 * @author: fanbopeng
 * @Date: 2019/1/13 13:47
 * @Description:
 *
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 * 思路 :
 *      转换为字符串 两两比较   冒泡  每次比较出最小的往 sb中添加
 *
 */
public class Array33 {




    public  static String PrintMinNumber(int [] numbers) {
      StringBuilder sb=new StringBuilder();
      String pre,last;
      int temp;
      for (int i=0;i<numbers.length;i++){
          for (int j=i+1;j<numbers.length;j++){
            pre=numbers[i]+""+numbers[j];
            last=numbers[j]+""+numbers[i];
            if (pre.compareTo(last)>0){
                temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;


            }


          }
          sb.append(numbers[i]);


      }



        return sb.toString();

    }


    public static void main(String[] args) {

        int[] num={1,6,22,2,9,1};

        System.out.println(PrintMinNumber(num));


    }




}
