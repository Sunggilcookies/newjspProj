package oops_p;

import java.util.Arrays;

public class Nums {

   public String name, grade;
   public int[] jum; // 점수배열의 배열(jum 안에 국영수 점수배열들어감)
   public float tot, avg;
   public int rank, score;

   public Nums(String name, String... jum) {
      super();
      this.name = name;
      this.jum = new int[jum.length];

      for (int i = 0; i < jum.length; i++) {
         this.jum[i] = Integer.parseInt(jum[i]);
      }
      calc();

   }

   void calc() { // void return 값이 없을때 가양미우수 판별
      tot = 0;
      for (int i : jum) {
         tot += i;
      }
      avg = tot / jum.length;
      grade = "가가가가가가양미우수".charAt((int) avg / 10) + "";
      // 몇 번째 문자열에서 인덱스 가져온다.

   }

   public void rankCalc(Nums[] exArr) { // 아무 배열을 집어넣었을때 배열인덱스만큼 반복
      rank = 1;
      for (Nums i : exArr) { // exArr[you]이런 뜻임
         if (avg < i.avg) {
            rank++;
         }
      }
   }

}