package com.kh.practice.array.func;

import java.util.Scanner;

public class RockPaperScissors {

    Scanner sc = new Scanner(System.in);

    public void rps() {
        System.out.print("당신의 이름을 입력해주세요 : ");
        String name = sc.next();
        int win = 0;
        int loss = 0;
        int draw = 0;

        while (true) {
            System.out.print("가위바위보 : ");
            String rps = sc.next();

            if (rps.equals("exit")) {
                System.out.println((win + loss + draw) + "전 " + win + "승 "
                        + draw + "무 " + loss + "패");
                break;
            }

            if (!(rps.equals("가위") || rps.equals("바위") || rps.equals("보"))) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            String[] computers = {"가위", "바위", "보"};
            int random = (int) (Math.random() * 3);
            String computerRps = computers[random]; // 컴퓨터의 패 변수에 저장

            System.out.println("컴퓨터 : " + computerRps);
            System.out.println(name + " : " + rps);

            // 판정 로직 수정
            if (computerRps.equals(rps)) {
                // 1. 비긴 경우
                System.out.println("비겼습니다.");
                draw++;
            } else if ((computerRps.equals("가위") && rps.equals("보"))
                    || (computerRps.equals("보") && rps.equals("바위"))
                    || (computerRps.equals("바위") && rps.equals("가위"))) {
                // 2. 진 경우 (else if 사용)
                System.out.println("졌습니다 ㅠㅠ");
                loss++;
            } else {
                // 3. 이긴 경우 (나머지 케이스)
                System.out.println("이겼습니다.");
                win++;
            }
        }
    }
}