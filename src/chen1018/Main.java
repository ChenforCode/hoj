package chen1018;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/3/1 15:25
 * @description: 给出一个数求出他阶乘的位数, 这一道题目刚开始的时候是直接按照题意用大数算的，然后转成字符串计算长度
 * 很遗憾超时了，看题解是采用这样的一个公式即log10(1*2*3*...*n) = log10(1) + log10(2) + log10(3) + ... + log10(n)
 * 即可以把长度换成以上的公式，但是记得加一，因为log10(100) = 2，但是100是三位数
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            double sum = 0;
            for (int j = 1; j <= x; j++){
                sum += Math.log10(j);
            }
            System.out.println((int)sum + 1);
        }
    }
}
