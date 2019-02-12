package chen1004;

import java.util.*;

/**
 * @author: ChenforCode
 * @date: 2019/1/31 11:12
 * @description: hoj 1004题 用一个map存储计数，然后找最大值就行了。。。刚开始做的排序是没有必要的
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0){
            String[] balls = new String[n];
            Map<String, Integer> ballMap = new HashMap<>();
            for (int i = 0; i < n; i++){
                String ball = sc.next();
                if (ballMap.containsKey(ball)){
                    ballMap.put(ball, ballMap.get(ball) + 1);
                } else {
                    ballMap.put(ball, 1);
                }
            }
            String [][] ballInfo = new String[ballMap.size()][2];
            int i = 0;
            Iterator it = ballMap.entrySet().iterator();
            String maxName = null;
            int maxNum = -1;
            while (it.hasNext()){
                Map.Entry entry = (Map.Entry) it.next();
                String ballName = (String) entry.getKey();
                String ballNum = entry.getValue().toString();
                if(Integer.parseInt(ballNum) > maxNum){
                    maxNum = Integer.parseInt(ballNum);
                    maxName = ballName;
                }
            }
            System.out.println(maxName);
        }
    }
}
