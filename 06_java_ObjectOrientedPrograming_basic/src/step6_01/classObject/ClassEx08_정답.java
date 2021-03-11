package step6_01.classObject;
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Scanner;

/*
class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}
*/

// 2021-03-08 21:44
public class ClassEx08_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ex08 e = new Ex08();

		int playerIndex = 0;

		for (int i = 0; i < e.game.length; i++) {
			if (e.game[i] == 2) {
				playerIndex = i;
			}
		}

		while (true) {

			System.out.print("game { ");
			for (int i = 0; i < e.game.length; i++) {
				System.out.print(e.game[i]);
				if (i < e.game.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(" }");
			System.out.println();
			System.out.println();
			System.out.print("1. left , 2. right : ");
			int selectNumber = sc.nextInt();

			// left
			if (selectNumber == 1) {

				// 왼쪽에 벽이 있으면
				if (playerIndex != 0 && e.game[playerIndex - 1] == 1) {

					System.out.print("* 벽 격파 (3) :");
					int wall = sc.nextInt();

					if (wall != 3) {
						continue;
					}
				}
				
				e.game[playerIndex] = 0;

				playerIndex--;

				if (playerIndex == -1) {
					playerIndex = e.game.length - 1;
				}

				e.game[playerIndex] = 2;

			}

			// right
			else if (selectNumber == 2) {

				// 오른쪽에 벽이 있으면
				if (playerIndex != e.game.length -1  && e.game[playerIndex + 1] == 1) {
					System.out.print("* 벽 격파 (3) :");
					int wall = sc.nextInt();

					if (wall != 3) {
						continue;
					}
				}

				e.game[playerIndex] = 0;

				playerIndex++;

				if (playerIndex == -1) {
					playerIndex = 0;
				}

				e.game[playerIndex] = 2;
			}

		}

	}

}
