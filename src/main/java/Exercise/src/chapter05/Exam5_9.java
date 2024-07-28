package chapter05;
//주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
public class Exam5_9 {

	public static void main(String[] args) {
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
				};
				char[][] result = new char[star[0].length][star.length];
				for (int i = 0; i < star.length; i++) {
					for (int j = 0; j < star[i].length; j++) {
						System.out.print(star[i][j]);
					}
					System.out.println();
				}
				System.out.println();
				//0행->3열
				//1행->2열
				//2행->1열
				//3행->0열
				//=====> 열: star.length-i-1
				//
				//1열->1행
				//2열->2행
				//3열->3행
				//4열->4행
				//5열->5행
				//=====> 행: j
				
				for (int i = 0; i < star.length; i++) {
					for (int j = 0; j < star[i].length; j++) {
						result[j][star.length-i-1] = star[i][j];
					}
				}
				for (int i = 0; i < result.length; i++) {
					for (int j = 0; j < result[i].length; j++) {
						System.out.print(result[i][j]);
					}
					System.out.println();
				}
	}

}

//**
//**
//*****
//*****

//****
//****
//**
//**
//**


