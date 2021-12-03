package com.myunghan.level9;
/*
    -[x] 소수는 해당 값에서 제곱근을 하여 제곱근을 한 수의 이하를 나누어 단 한번이라도 0이 나오게 되면 소수가 아니다.
    -[x] from ~ to 입력받기 (1 <= from, to <= 10,000) (from <= to)
    -[x] from~to 범위 중에서 소수를 찾고 그 소수의 합과 최솟값을 구하기
        -[x] from~to의 범위 크기의 minorities리스트 선언
        -[x] from~to의 순차적으로 접근하여 소수가 맞는지 확인하고 minorities리스트에 추가
        -[x] 소수만 남은 minority리스트에 합과 최솟값을 구한다.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // from과 to 입력받기
        int from = scanner.nextInt();
        scanner.nextLine();
        int to = scanner.nextInt();
        scanner.nextLine();

        // from~to의 범위 크기의 minorities리스트 선언
        List<Integer> minorities = new ArrayList<>();

        // from~to의 순차적으로 접근하여 소수가 맞는지 확인하고 minorities리스트에 추가
        for (int num = from; num <= to; num++) {
            boolean boolMinority = true; // 만약 소수이면 true, 소수가 아니면 false
            if (num == 1) {
                boolMinority = false;
            } else {
                int startNum = (int) Math.sqrt(num);
                for (int i = startNum; i >= 2; i--) {
                    if (num % i == 0) {
                        boolMinority = false;
                    }
                }
                if (boolMinority == true) {
                    minorities.add(num);
                }
            }
        }

        // 소수만 남은 minority리스트에 합과 최솟값을 구한다.
        if (minorities.isEmpty() == true) {
            System.out.println("-1");
        } else {
            int sum = 0;
            int min = minorities.get(minorities.size() - 1);
            for (int minority : minorities) {
                sum += minority;
                min = Math.min(min, sum);
            }
            System.out.println(sum);
            System.out.println(min);
        }
    }

}
