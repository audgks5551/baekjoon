package com.myunghan.level9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    -[x] 정수 number 입력받기
    -[x] 소인수분해하는 소수를 받기 위해 list 선언
    -[x] 2부터 시작하여 n까지 나누어서 딱 떨어진다면 나눈 값을 소인수분해list에 저장한다.
    -[x] 그리고 나눈 몫을 number에 저장하고 다시 위에 과정을 2~n까지 반복한다.
 */
public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 number 입력받기
        int number = scanner.nextInt();
        scanner.nextLine();

        // 소인수분해하는 소수를 받기 위해 list 선언
        List<Integer> smallFactorization = new ArrayList<>();

        // 2부터 시작하여 n까지 나누어서 딱 떨어진다면 나눈 값을 소인수분해list에 저장한다.
        // 그리고 나눈 몫을 number에 저장하고 다시 위에 과정을 2~n까지 반복한다.
        for (int i = 2; i <= number; ++i) {
            if (number % i == 0) {
                smallFactorization.add(i);
                number = number / i;
                i = 1;
            }
            if(number == 1) {
                break;
            }
        }

        // 소인수분해 결과 출력
        for (int minority : smallFactorization) {
            System.out.println(minority);
        }

    }
}
