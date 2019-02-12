package chen1005;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/1 10:15
 * @description: 1005题，给出如下定义：f(1) = 1, f(2) = 1, f(n) = (A * f(n - 1) + B * f(n - 2)) mod 7.
 */
public class Main {
    //直接递归的话超时

    //不用递归用循环试一试。。。一直wa
    //第三次试试找周期，因为N的范围实在是太大了
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        while (a != 0 || b != 0 || n != 0) {
            int[] res = new int[10000];
            res[1] = 1;
            res[2] = 1;
            int i;
            //这个地方注意一定不能等于10000，可能会超限
            for (i = 3; i < 10000; i++) {
                res[i] = (a * res[i - 1] + b * res[i - 2]) % 7;
                //找到周期了
                if (res[i] == 1 && res[i - 1] == 1){
                    break;
                }
            }
            n = n % (i - 2);
            res[0] = res[i - 2];
            System.out.println(res[n]);
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
        }
    }
}
