package step6_01.classObject;

import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

/*
class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}
*/

//2021-03-08 21:10

public class ClassEx06_정답 {

	public static void main(String[] args) {
		
		Ex06 e = new Ex06();
		Random random = new Random();
		
		String answerSheet[] = new String[5];
		
		// 정답지 생성
		for (int i = 0; i < e.hgd.length; i++) {
			e.hgd[i] = random.nextInt(5) + 1;
		}
		
		//정오표 생성
		for (int i = 0; i < answerSheet.length; i++) {
			if (e.answer[i] == e.hgd[i]) {
				answerSheet[i] = "O";
				e.score += 20;
				e.answerCnt ++;
			} else {
				answerSheet[i] = "X";
			}
		}
		
		// e.answer print
		System.out.print("\n answer      {");
		for (int i = 0; i < e.answer.length; i++) {
			System.out.print(e.answer[i]);
			if (i < e.answer.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		// e.hgd print
		System.out.print(" hgd         {");
		for (int i = 0; i < e.hgd.length; i++) {
			System.out.print(e.hgd[i]);
			if (i < e.hgd.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		// answerSheet  print
		System.out.print(" answerSheet {");
		for (int i = 0; i < answerSheet.length; i++) {
			System.out.print(answerSheet[i]);
			if (i < answerSheet.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		
		
		System.out.println(" answerCnt : " + e.answerCnt);
		System.out.println(" score : " + e.score + " 점");

	}

}
