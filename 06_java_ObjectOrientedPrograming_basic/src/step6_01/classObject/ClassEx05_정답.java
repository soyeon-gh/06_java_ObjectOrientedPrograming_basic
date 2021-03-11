package step6_01.classObject;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

/*
class Ex05{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}
*/

//2021-03-08 20:40
public class ClassEx05_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "메가IT 고등학교";
		int max = 0;
		
		
		while (true) {
			
			// 메뉴 출력
			//System.out.println("=== " + mega.name + "===");
			
			System.out.println("┌────────────────────────┐");
			System.out.println("│ 학생성적 관리 프로그램 │");
			System.out.println("├────────────────────────┤");
			System.out.println("│ 1.전교생 성적확인      │");
			System.out.println("│ 2.1등학생 성적확인     │");
			System.out.println("│ 3.꼴등학생 성적확인    │");
			System.out.println("│ 4.성적확인하기         │");
			System.out.println("│ 5.종료하기             │");
			System.out.println("└────────────────────────┘");
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			
			if		(choice == 1) {
				
				System.out.println("┌─────────────────────┐");
				System.out.println("│   전교생 성적확인   │");
				System.out.println("├─────────────────────┤");
				System.out.print("│ ");
				for (int i = 0; i < mega.arScore.length; i++) {
					System.out.print(mega.arScore[i]);
					if (i < mega.arScore.length - 1) {
						System.out.print(", ");
					}
					if (max < mega.arScore[i]) {
						max = mega.arScore[i];
					}
					
				}
				System.out.println(" │");
				System.out.println("└─────────────────────┘");
			}
			else if (choice == 2) {
				
				System.out.println("┌──────────────────────┐");
				System.out.println("│ 1등 학생 성적 : " + max + "    │");
				System.out.println("└──────────────────────┘");
				
			}
			else if (choice == 3) {
				
				int min = mega.arScore[0];
				for (int i = 1; i < mega.arScore.length; i++) {
					if (min > mega.arScore[i]) {
						min = mega.arScore[i];
					}
				}
				System.out.println("┌──────────────────────┐");
				System.out.println("│ 꼴등 학생 성적 : " + min + "  │");
				System.out.println("└──────────────────────┘");
			}
			else if (choice == 4) {
				
				System.out.println("───────────────────────────");
				System.out.print("학번을 입력해주세요 : ");
				int getGradeNumber = sc.nextInt();
				
				int check = -1;
				
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if (mega.arHakbun[i] == getGradeNumber) {
						check = i;
					}
				}
				
				if (check > -1) {
					System.out.println("───────────────────────────");
					System.out.println("학번 : " + getGradeNumber + ", 성적 : " + mega.arScore[check]);
				} else if (check == -1) {
					System.out.println("┌─────────────────────┐");
					System.out.println("│   없는 학번입니다   │");
					System.out.println("└─────────────────────┘");
					check = -1;
				}
			}
			else if (choice == 5) {
				System.out.println("┌─────────────────┐");
				System.out.println("│  프로그램 종료  │");
				System.out.println("└─────────────────┘");
				break;
			}
		}
		
		sc.close();

	}

}
