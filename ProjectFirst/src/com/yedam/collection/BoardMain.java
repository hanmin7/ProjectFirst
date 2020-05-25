package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();

		BoardService service = new BoardServiceImpl();

		while (true) {
			System.out.println("=======================================");
			System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("=======================================");
			System.out.print("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			
			if (menu == 1) {
				System.out.println("제목입력.");
				String title = scn.nextLine();
				System.out.println("내용입력.");
				String contents = scn.nextLine();
				System.out.println("작성자입력.");
				String name = scn.nextLine();
				Board board = new Board(title, contents, name);
				service.insert(list, board); // list 컬렉션에 board를 담아라

				for (Board brd : list) {
					System.out.println(brd);
				}
				System.out.println("게시글이 작성되었습니다");
			} else if (menu ==2 ) {
				
			}
			
		}
	}
}
