package chen1016;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/28 08:02
 * @description: 一个求排列的问题，所以用DFS+回溯即可
 */
public class Main {
    static int[] book;
    static int[] a;
    static int n;
    static boolean haveResult = false;
    static int resultNum = 1;
    static int caseNum = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            a = new int[n + 1];
            book = new int[n + 1];
            a[1] = 1;
            book[1] = 1;
            haveResult = false;
            resultNum = 1;
            dfs(2);
            if (!haveResult){
                break;
            }
            caseNum++;
        }

    }

    public static void dfs(int step) {
        if (step == n + 1 && checkPrime(a[1] + a[n])) {
            haveResult = true;
            if (resultNum == 1){
                if (caseNum != 1) {
                    System.out.println();
                }
                System.out.println("Case " + caseNum + ":");
            }
            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    System.out.print(a[i]);
                } else {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
            resultNum++;
            return;
        }

        for (int i = 2; i <= n; i++) {
            if (book[i] == 0 && checkPrime(a[step - 1] + i)) {
                book[i] = 1;
                a[step] = i;
                dfs(step + 1);
                book[i] = 0;
            }
        }
    }

    public static boolean checkPrime(int checkNum) {
        if (checkNum < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
