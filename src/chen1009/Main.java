package chen1009;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/2 10:24
 * @description: è����ʳ�̰���㷨�������ܵذ��Ƚϱ��˵�ʳ��ȥ����
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int catFood, n;
        while ((catFood = sc.nextInt()) != -1 && (n = sc.nextInt()) != -1) {
            int[] javaBeans = new int[n];
            int[] food = new int[n];
            for (int i = 0; i < n; i++) {
                javaBeans[i] = sc.nextInt();
                food[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    //�����ٵ�è��������javabean������Խ����Խ��ǰ����
                    if ((double) javaBeans[j] / food[j] > (double) javaBeans[i] / food[i]) {
                        int temp = javaBeans[j];
                        javaBeans[j] = javaBeans[i];
                        javaBeans[i] = temp;

                        temp = food[j];
                        food[j] = food[i];
                        food[i] = temp;
                    }
                }
            }
            double sumJavabeans = 0;
            for (int i = 0; i < n; i++) {
                //���ʣ���è�����ܹ��򣬾�ȫ��
                if (catFood >= food[i]) {
                    catFood -= food[i];
                    sumJavabeans += javaBeans[i];
                } else {
                    double price = (double) javaBeans[i] / food[i];
                    sumJavabeans += price * catFood;
                    break;
                }
            }
            System.out.printf("%.3f\n", sumJavabeans);
        }
    }
}
