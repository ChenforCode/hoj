package chen1021;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/3/11 00:40
 * @description: 斐波那契数列 f(0) = 7 f(1) = 11 f(n) = f(n-1) + f(n-2) 如果f(n) % 3 == 0则输出yes
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n % 4 == 2){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    //常规方法不行，那就找规律
    /*public static long get(long n) {
        if (n == 0) {
            return 7;
        } else if (n == 1) {
            return 11;
        } else {
            return get(n - 1) + get(n - 2);
        }
    }*/
}
