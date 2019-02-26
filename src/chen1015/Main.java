package chen1015;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/26 10:59
 * @description:
 */
public class Main {
    static char[] a = new char[5];
    static char[] max = new char[5];
    static int[] book = new int[12];
    static char[] cards = new char[12];
    static int num;
    static String strCard;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        strCard = sc.next();
        while (!(num == 0 && "END".equals(strCard))){
            char[] cards = strCard.toCharArray();
            System.out.println(book[10]);



            num = sc.nextInt();
            strCard = sc.next();
        }
    }

    public static void dfs(int step){
        if (step == 5){
            if (a[0] - '@' - Math.pow(a[1] - '@', 2) + Math.pow(a[2] - '@', 3) - Math.pow(a[3] - '@', 4) +
                Math.pow(a[4] - '@', 5) == num){
                String maxStr = max.toString();
                String nowStr = a.toString();
                //如果目前的答案的字典序比较小，那么就更新答案
                if (maxStr.compareTo(nowStr) < 0){
                    max = nowStr.toCharArray();
                }
            }
            return;
        } else {
            for (int i = 0; i < cards.length; i++){
                if (book[i])
            }
        }
    }
}
