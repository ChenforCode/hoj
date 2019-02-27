package chen1015;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/26 10:59
 * @description: 一个深搜求满足 a-b^2+c^3-d^4+e^5=num的abcde组合
 */
public class Main {
    static char[] a = new char[5];
    static int[] book = new int[12];
    static String strCards;
    static char[] cards;
    static int num;
    static boolean judge = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        strCards = sc.next();
        cards = strCards.toCharArray();
        while (!(num == 0 && strCards.equals("END"))) {
            for (int i = 0; i < cards.length - 1; i++) {
                for (int j = 0; j < cards.length - i - 1; j++) {
                    if (cards[j] < cards[j + 1]) {
                        char temp = cards[j];
                        cards[j] = cards[j + 1];
                        cards[j + 1] = temp;
                    }
                }
            }
            dfs(0);
            if (!judge){
                System.out.println("no solution");
            }
            judge = false;
            book = new int[12];
            num = sc.nextInt();
            strCards = sc.next();
            cards = strCards.toCharArray();
        }
    }

    public static void dfs(int step) {
        if (judge){
            return;
        }
        if (step == 5) {
            if (a[0] - 'A' + 1 - Math.pow(a[1] - 'A' + 1, 2) + Math.pow(a[2] - 'A' + 1, 3) -
                    Math.pow(a[3] - 'A' + 1, 4) + Math.pow(a[4] - 'A' + 1, 5) == num){
                for (int i = 0 ; i < 5; i++){
                    System.out.print(a[i]);
                }
                System.out.println();
                judge = true;
            }
            return;
        }
        for (int i = 0; i < cards.length; i++){
            if (book[i] == 0){
                a[step] = cards[i];
                book[i] = 1;
                dfs(step + 1);
                book[i] = 0;
            }
        }
    }
}
