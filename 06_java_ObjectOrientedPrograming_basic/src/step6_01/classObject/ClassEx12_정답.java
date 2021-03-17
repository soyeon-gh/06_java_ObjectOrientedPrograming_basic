package step6_01.classObject;
/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

import java.util.Scanner;

/*
class Ex12{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}
*/


public class ClassEx12_정답 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex12 e = new Ex12();
		
		System.out.println(" ===틱택토===");
		for (int i = 0; i < e.game.length; i++) {
			for (int j = 0; j < e.game.length; j++) {
				System.out.print(" [ ]");
			}
			System.out.println();
		}
		System.out.println("========================");
		
		System.out.print("Player 1 : ");
		int player1 = sc.nextInt();
		
		
		
		
//		while(true) {
//			
//			
//			
//			
//			
//		}
		
		
		
		
	}

}
