package com.myunghan.level9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  -[x] 한 줄에 m이상 n이하의 범위를 입력받기
  -[] m과 n사이의 소수 구하기
    -[x] minorities 리스트 생성
    -[] for문을 이용하여 m과 n사이의 소수 찾기


 */
public class Four {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 한 줄에 m이상 n이하의 범위를 입력받기
    int from = scanner.nextInt();
    int to = scanner.nextInt();
    scanner.nextLine();

    // minorities 리스트 생성
    List<Integer> minorities = new ArrayList<>();

    for(int number = from; number <= to; number++) {
      minorities.add(number);
    }

    // for문을 이용하여 m과 n사이의 소수 찾기
    for (int number = from; number <= to; number++) {
      int sqrt = (int) Math.sqrt(number);
      if(number % sqrt == 0) {

      }
    }

    for (int minority : minorities) {
      System.out.println(minority);
    }


  }
}
