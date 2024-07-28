package chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam11_10 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		int[][] board = new int[5][5];
		
		while(set.size() < 25) {
			int random = (int) (Math.random() * 30) + 1;
			boolean save = set.add(random);
			if(save) al.add(random);
		}

		Iterator<Integer> it = al.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
	} // main
}
