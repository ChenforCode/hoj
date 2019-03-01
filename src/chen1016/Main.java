package chen1016;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/28 08:02
 * @description: 一个求排列的问题，所以用DFS+回溯即可
 */
public class Main {
    /*static int[] a;
    static int[] book;
    static int num;
    static int ans = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while ((num = sc.nextInt()) > 0 && num < 20) {
            //对数据进行初始化
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
            //除了头尾，已经保证为素数
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
        //1已经被占用了，不需要判断了
        for (int i = 2; i <= num; i++) {
            //保证与前一个数字之和为素数
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


    //重新写吧。。判断素数的时候可以打表，因为数据量比较小
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
