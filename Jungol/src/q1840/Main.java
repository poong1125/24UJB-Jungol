package q1840;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int Se = sc.nextInt();
      int Ga = sc.nextInt();
      int time = 0;
      int cheese_value = 0;
      int cheese_value_2 = 0;
      int outside_air = 0;
      int[][] cheese = new int[Se][Ga];
      int[][] cheese2 = new int[Se][Ga]; // 두가지 배열 만든 이유 : for 문 돌아갈때 서로가 서로를 비교해서 바뀌어 버리면 뒤에꺼도 바뀜

      for (int i = 0; i < Se; i++) { // 치즈 1 에 배열 만들고 치즈 2 에 배열복사
         for (int o = 0; o < Ga; o++) {
            cheese[i][o] = sc.nextInt();
            cheese2[i][o] = cheese[i][o];
         }
      }
      sc.close();
      
      for (int i = 0; i < Se; i++) { // 외부 공기는 3으로 바꾸기
         for (int o = 0; o < Ga; o++) {
            if(i == 0 || i == (Se-1) || o == 0 || o == (Ga-1)) {
               cheese[i][o] = 3;
               cheese2[i][o] = cheese[i][o];
            }
         }
      }
      
      for(;;) { // 내부 공기를 뺀 나머지 공기들을 전부 외부공기로 치환
         outside_air=0;
         for (int i = 1; i < Se-1; i++) {
            for (int o = 1; o < Ga-1; o++) {
               if(cheese[i][o] == 0) {
                  if(cheese2[i-1][o] == 3 || cheese2[i+1][o] == 3 ||cheese2[i][o-1] == 3 ||cheese2[i][o+1] == 3) {
                     cheese[i][o] = 3;
                  }
               }
            }
         }
         for (int i = 0; i < Se; i++) { // 다시 배열 복사
             for (int o = 0; o < Ga; o++) {
                if(cheese2[i][o] != cheese[i][o]) {
                cheese2[i][o] = cheese[i][o];
                outside_air++;
                }
             }
         }
         if(outside_air == 0) {
         break;
         }
      }
      
      while (true) {
         cheese_value=0;
         for (int i = 1; i <= Se-2; i++) {  // 치즈가 1인게 있고 있으면 확인 후 3으로 바꾸는거
            for (int o = 1; o <= Ga-2; o++) {
               if (cheese[i][o] == 1) {
                  if(cheese2[i-1][o] == 3 || cheese2[i+1][o] == 3 || cheese2[i][o-1] == 3 || cheese2[i][o+1] == 3) {
                     cheese[i][o] = 3;
                     cheese_value++;
                  }
               }
            }
         }
         for (int i = 0; i < Se; i++) { // 배열 복사
             for (int o = 0; o < Ga; o++) {
                cheese2[i][o] = cheese[i][o];
             }
         }
         
         time++;
         
         for(;;) { //내부 공기가 외부 공기로 변하는게 있는지 확인
            outside_air=0;
            for (int i = 0; i < Se; i++) {
               for (int o = 0; o < Ga; o++) {
                  if(cheese[i][o] == 0) {
                     if(cheese2[i-1][o] == 3 || cheese2[i+1][o] == 3 ||cheese2[i][o-1] == 3 ||cheese2[i][o+1] == 3) {
                        cheese[i][o] = 3;
                        outside_air++;
                     }
                  }
               }
            }
            for (int i = 0; i < Se; i++) { // 배열복사
                for (int o = 0; o < Ga; o++) {
                   cheese2[i][o] = cheese[i][o];
                }
            }
            if(outside_air == 0) { // 외부공기로 변환된 내부공기가 없으면 통과
            break;
            }
         }


         if(0 < cheese_value) { // 치즈 개수가 0이 되기 전에 치즈 2에다가 마지막 치즈 개수 넣기
            cheese_value_2 = cheese_value;
         }
         
         if (cheese_value == 0) { // 치즈가 0개이면 무한루프 끝
            break;
         }
         }
      
      System.out.println(time-1); 
      System.out.println(cheese_value_2); // 치즈가 0개이기 전 치즈 개수

   }
}