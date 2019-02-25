package chen1013;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/25 12:26
 * @description: 将数字的各位相加，直到得到个位数的和..这一道题没有说题目数字的范围，那么就必须考虑无限大了
 * 所以不能用int或者long输入，必须用字符串。还有一个更简单的方法是利用一个9余数定理。也就是所有数字的根数都
 * 是这个是对9的余数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*long num;
        while ((num = sc.nextLong()) != 0) {
            long sum = 0;
            if (num >= 10) {
                for (; ; ) {
                    //一位一位的拆开，相加
                    while (num / 10 != 0) {
                        sum += (num % 10);
                        num /= 10;
                    }
                    //加上最后一位
                    sum += num;
                    //判断这个和是不是个位数，如果是个位数就退出for循环，结束了
                    if (sum < 10) {
                        break;
                    }
                    //如果还是两位数及以上，那么把sum赋值给num，继续计算和
                    num = sum;
                    //清零这个sum，因为这个sum是没用的
                    sum = 0;
                }
            } else {
                sum = num;
            }*/

        String num = "";
        while (!("0".equals(num = sc.next()))) {
            while (true){
                int sum = 0;
                for (int i = 0; i < num.length(); i++){
                    sum += Integer.parseInt(num.charAt(i) + "");
                }
                if ((sum + "").length() == 1){
                    System.out.println(sum);
                    break;
                }
                num = sum + "";
                sum = 0;
            }
        }
    }
}
