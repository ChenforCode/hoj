package chen1016;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/28 08:02
 * @description: һ�������е����⣬������DFS+���ݼ���
 */
public class Main {
    /*static int[] a;
    static int[] book;
    static int num;
    static int ans = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while ((num = sc.nextInt()) > 0 && num < 20) {
            //�����ݽ��г�ʼ��
            a = new int[num + 1];
            book = new int[num + 1];
            a[1] = 1;
            book[1] = 1;
            if (ans != 1){
                System.out.println();
            }
            System.out.println("Case " + ans + ":");
            dfs(2);
            ans++;
        }
    }

    public static void dfs(int step) {
        if (step == num + 1) {
            //����ͷβ���Ѿ���֤Ϊ����
            if (checkPrime(a[1] + a[num])) {
                for (int i = 1; i <= num; i++) {
                    if (i == num){
                        System.out.print(a[i]);
                    } else {
                        System.out.print(a[i] + " ");
                    }
                }
                System.out.println();
            }
            return;
        }
        //1�Ѿ���ռ���ˣ�����Ҫ�ж���
        for (int i = 2; i <= num; i++) {
            //��֤��ǰһ������֮��Ϊ����
            if (book[i] == 0 && checkPrime(i + a[step - 1])) {
                a[step] = i;
                book[i] = 1;
                dfs(step + 1);
                book[i] = 0;
            }
        }
    }

    public static boolean checkPrime(int a) {
        int k = (int) Math.sqrt(a);
        for (int i = 2; i <= k; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }*/


    //����д�ɡ����ж�������ʱ����Դ����Ϊ�������Ƚ�С
    static int[] book = new int[20];
    static int[] a;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n + 1];

    }

    public void dfs(int step){
        if (step == n + 1 && a[1]){

        }
    }

    public boolean checkPrime(){

    }

}
