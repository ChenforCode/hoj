package chen1018;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/3/1 15:25
 * @description: ����һ����������׳˵�λ��, ��һ����Ŀ�տ�ʼ��ʱ����ֱ�Ӱ��������ô�����ģ�Ȼ��ת���ַ������㳤��
 * ���ź���ʱ�ˣ�������ǲ���������һ����ʽ��log10(1*2*3*...*n) = log10(1) + log10(2) + log10(3) + ... + log10(n)
 * �����԰ѳ��Ȼ������ϵĹ�ʽ�����Ǽǵü�һ����Ϊlog10(100) = 2������100����λ��
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            double sum = 0;
            for (int j = 1; j <= x; j++){
                sum += Math.log10(j);
            }
            System.out.println((int)sum + 1);
        }
    }
}
