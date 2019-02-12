package chen1008;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/2 10:01
 * @description: 1008, 电梯问题，上升6s，下降4秒，每层停5s，包括最后一层也停五秒
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            int sum = n * 5;
            int floor = 0;
            for (int i = 0; i < n; i++) {
                int nextFloor = sc.nextInt();
                int dis = nextFloor - floor;
                if (dis < 0) {
                    sum += (4 * Math.abs(dis));
                } else {
                    sum += (6 * dis);
                }
                floor = nextFloor;
            }
            System.out.println(sum);
        }
    }
}
