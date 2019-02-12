package chen1005;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/1 10:15
 * @description: 1005�⣬�������¶��壺f(1) = 1, f(2) = 1, f(n) = (A * f(n - 1) + B * f(n - 2)) mod 7.
 */
public class Main {
    //ֱ�ӵݹ�Ļ���ʱ

    //���õݹ���ѭ����һ�ԡ�����һֱwa
    //���������������ڣ���ΪN�ķ�Χʵ����̫����
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        while (a != 0 || b != 0 || n != 0) {
            int[] res = new int[10000];
            res[1] = 1;
            res[2] = 1;
            int i;
            //����ط�ע��һ�����ܵ���10000�����ܻᳬ��
            for (i = 3; i < 10000; i++) {
                res[i] = (a * res[i - 1] + b * res[i - 2]) % 7;
                //�ҵ�������
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
