package chen1012;

/**
 * @author: ChenforCode
 * @date: 2019/2/12 11:30
 * @description: 求e  直接print是真的骚
 */
public class Main {
    public static int jie(int n){
        if (n == 0){
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("n e");
        System.out.println("- -----------");
        System.out.println("0 1");
        System.out.println("1 2");
        System.out.println("2 2.5");
        for (int i = 3; i <= 9; i++){
            double sum = 0;
            System.out.print(i + " ");
            for (int j = 0; j <= i; j++){
                sum += ((double) 1 / jie(j));
            }
            System.out.printf("%.9f", sum);
            System.out.println();
        }
    }
}
