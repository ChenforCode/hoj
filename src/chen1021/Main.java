package chen1021;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/3/11 00:40
 * @description: 쳲��������� f(0) = 7 f(1) = 11 f(n) = f(n-1) + f(n-2) ���f(n) % 3 == 0�����yes
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

    //���淽�����У��Ǿ��ҹ���
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
