package q1840;

import java.util.Scanner;

public class Main1 {
   static int dx[] = {0, 0, -1, 1};
   static int dy[] = {1, -1, 0, 0};
   static int n, m;
   static int[][] Cheese;
   static boolean[][] visited;
   static int CheeseCnt;
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      m = sc.nextInt();
      
      Cheese = new int[n][m];
      for(int i = 0; i < n; i ++) {
         for(int j = 0; j < m; j++) {
            Cheese[i][j] = sc.nextInt();
            if(Cheese[i][j] == 1) {
               CheeseCnt ++;
            }
         }
      }
      int time = 0;
      int LastCheeseCnt = 0;
      while(CheeseCnt != 0) {
         time ++;
         LastCheeseCnt = CheeseCnt;
         visited = new boolean[n][m];
         dfs(0, 0);
      }
      System.out.println(time);
      System.out.println(LastCheeseCnt);
      sc.close();
   }
   
   public static void dfs(int x, int y) {
      visited[x][y] = true;
      
      for(int i = 0; i < 4; i ++) {
         int nx = x + dx[i];
         int ny = y + dy[i];
         
         if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
            visited[nx][ny] = true;
            if(Cheese[nx][ny] == 0) {
               dfs(nx, ny);
            }else if(Cheese[nx][ny] == 1) {
               CheeseCnt --;
               Cheese[nx][ny] = 0;
            }
         }
      }
   }
}