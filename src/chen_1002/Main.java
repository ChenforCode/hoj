package chen_1002;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2018/11/26 16:37
 * @description: A+B problem 数据会很大很大，可以用大数类试一试
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println("Case " + (i + 1) + ":");
            System.out.println(a + " + " + b + " = " + a.add(b));
            if (i < n - 1){
                System.out.println();
            }
        }
    }
}
