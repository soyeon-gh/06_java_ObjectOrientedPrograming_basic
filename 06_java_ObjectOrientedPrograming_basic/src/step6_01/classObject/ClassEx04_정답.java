package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

/*
class Ex04 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}
*/

//2021-03-08 20 : 15
public class ClassEx04_정답 {

	public static void main(String[] args) {
		
		Ex04 e = new Ex04();
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.println(" 문제1) scores배열에 1~100점 사이의 정수를 5개 저장");
		System.out.println();
		System.out.print(" ");
		for (int i = 0; i < e.scores.length; i++) {
			e.scores[i] = random.nextInt(100) + 1;
			System.out.print(e.scores[i]);
			if (i < e.scores.length -1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.println(" 문제2) 전교생의 총점과 평균 출력");
		System.out.println();
		
		int totalScore = 0;
		double avg = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			totalScore += e.scores[i];			
		}
		
		avg = totalScore / e.scores.length;
		
		System.out.println(" 총점 : " + totalScore + ", 평균 : " + avg);
		
		
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.println(" 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력 ");
		System.out.println();
		
		int cnt = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] >= 60) {
				cnt ++;
			}
		}
		
		System.out.println(" 합격자 수 : " + cnt + "명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.println(" 문제4) 인덱스를 입력받아 성적 출력");
		System.out.println();
		
		System.out.print(" 인덱스 입력 : ");
		int index = sc.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] == e.scores[index]) {
				System.out.println(" 성적 : " + e.scores[i]);
			}
		}
		
		
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.println(" 문제5) 성적을 입력받아 인덱스 출력");
		System.out.println();
		
		System.out.print(" 성적 입력 : ");
		int score = sc.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] == score) {
				System.out.println(" 인덱스 : " + i);
			}
		}
		
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.println(" 문제6) 학번을 입력받아 성적 출력");
		System.out.println();
		
		System.out.print(" 학번입력 : ");
		int gradeNumber = sc.nextInt();
		int check = -1;
		for (int i = 0; i < e.hakbuns.length; i++) {
			if (gradeNumber == e.hakbuns[i]) {
				check = i;
			}
		}

		if(check > -1) {
			System.out.println(" 성적 : " + e.scores[check]);
		} else {
			System.out.println(" 없는 학번입니다.");
		}
		
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.println(" 문제7) 학번을 입력받아 성적 출력");
		System.out.println();
		
		System.out.print(" 학번입력 : ");
		gradeNumber = sc.nextInt();
		check = -1;
		for (int i = 0; i < e.hakbuns.length; i++) {
			if (gradeNumber == e.hakbuns[i]) {
				check = i;
			}
		}

		if(check > -1) {
			System.out.println(" 성적 : " + e.scores[check]);
		} else {
			System.out.println(" 없는 학번입니다.");
		}
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.println(" 문제8) 1등학생의 학번과 성적 출력");
		System.out.println();
		int max = 0;
		index = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (max < e.scores[i]) {
				max = e.scores[i];
				index = i;
			}
		}
		
		System.out.println(" " + e.hakbuns[index] + " 번(" + max + ")");
		
		sc.close();
	}

}
