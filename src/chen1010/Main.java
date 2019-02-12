package chen1010;

import java.util.Scanner;

/**
 * @author: ChenforCode
 * @date: 2019/2/12 10:23
 * @description: �Թ����⣬���������·��(f**k???)
 */
public class Main {
    private static int bx, by, ex, ey, len, wid, time;
    private static int min = 0;
    private static String [][]map = new String[10][10];
    private static int [][]visit = new int[10][10];
    private static int go[][] = {{0,1}, {1,0}, {0, -1},{-1, 0}};

    //˭�ܸ�������ô��ȡ�ַ�������
    public static void dfs(int x, int y, int step){
        if(ex == x && ey == y){
            if (step < min){
                min = step;
            }
        }
        for (int i = 0; i < 4; i++){
            int xx = x + go[i][0];
            int yy = y + go[i][1];
            if (xx >= 0 && xx < len && yy >= 0 && yy < wid && visit[xx][yy] == 0 && !map[xx][yy].equals("X")){
                visit[xx][yy] = 1;
                dfs(xx, yy, step+1);
                visit[xx][yy] = 0;
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            min = 0;
            len = sc.nextInt();
            wid = sc.nextInt();
            time = sc.nextInt();
            if (len == 0 && wid == 0 && time == 0){
                break;
            }
            //��ʼ����ͼ������������̲���
            for (int i = 0; i < len; i++){
                for (int j = 0; j < wid; j++){
                    map[i][j] = "";
                    visit[i][j] = 0;
                }
            }
            String [][]map = new String[len][wid];
            for (int i = 0; i < len; i++){
                for (int j = 0; j < wid; j++){
                    map[i][j] = sc.next();
                    //��¼��ʼ��λ��
                    if ("S".equals(map[i][j])){
                        bx = i;
                        by = j;
                    }
                    //��¼������λ��
                    if ("D".equals(map[i][j])){
                        ex = i;
                        ey = j;
                    }
                }
            }

            if (min <= time){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
