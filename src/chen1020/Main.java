package chen1020;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/3/1 16:48
 * @description: 编码，感觉类似于桶排序,23333不是桶排序啦，读错题意了
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int len = str.length();
            char[] chars = str.toCharArray();
            int sum = 0;
            for (int j = 1; j < len; j++) {
                if (chars[j - 1] == chars[j]) {
                    sum++;
                } else {
                    if (sum == 0) {
                        System.out.print(chars[j - 1]);
                    } else {
                        System.out.print(sum + 1);
                        System.out.print(chars[j - 1]);
                        sum = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}
