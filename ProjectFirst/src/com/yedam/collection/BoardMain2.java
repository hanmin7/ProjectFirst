package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		List<Board> list = new ArrayList<>(); BoardServiceImpl2에 선언해줬음

		BoardService2 service = new BoardServiceImpl2();

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
				service.insert(board); // list 컬렉션에 board를 담아라

//				for (Board brd : list) {
//					System.out.println(brd);
//				}
//				System.out.println("게시글이 작성되었습니다");
				
			} else if (menu ==2) {
				System.out.println("제목입력.");
				String title = scn.nextLine();
				System.out.println("변경내용입력.");
				String contents = scn.nextLine();
				Board board = new Board(title, contents, null);
				service.update(board);
				
			} else if (menu ==3) {
				System.out.println("제목입력.");
				String title = scn.nextLine();
				service.delete(title);
				
			} else if (menu ==4) {
				service.show();
				
			} else if (menu ==5) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
