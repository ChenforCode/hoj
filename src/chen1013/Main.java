package chen1013;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/25 12:26
 * @description: �����ֵĸ�λ��ӣ�ֱ���õ���λ���ĺ�..��һ����û��˵��Ŀ���ֵķ�Χ����ô�ͱ��뿼�����޴���
 * ���Բ�����int����long���룬�������ַ���������һ�����򵥵ķ���������һ��9��������Ҳ�����������ֵĸ�����
 * ������Ƕ�9��������
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*long num;
        while ((num = sc.nextLong()) != 0) {
            long sum = 0;
            if (num >= 10) {
                for (; ; ) {
                    //һλһλ�Ĳ𿪣����
                    while (num / 10 != 0) {
                        sum += (num % 10);
                        num /= 10;
                    }
                    //�������һλ
                    sum += num;
                    //�ж�������ǲ��Ǹ�λ��������Ǹ�λ�����˳�forѭ����������
                    if (sum < 10) {
                        break;
                    }
                    //���������λ�������ϣ���ô��sum��ֵ��num�����������
                    num = sum;
                    //�������sum����Ϊ���sum��û�õ�
                    sum = 0;
                }
            } else {
                sum = num;
            }*/

        String num = "";
        while (!("0".equals(num = sc.next()))) {
            while (true){
                int sum = 0;
                for (int i = 0; i < num.length(); i++){
                    sum += Integer.parseInt(num.charAt(i) + "");
                }
                if ((sum + "").length() == 1){
                    System.out.println(sum);
                    break;
                }
                num = sum + "";
                sum = 0;
            }
        }
    }
}
