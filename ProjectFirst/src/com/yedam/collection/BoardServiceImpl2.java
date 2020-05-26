package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl2 implements BoardService2{
	List<Board> list = new ArrayList<>();

	@Override
	public void insert(Board board) {
		list.add(board);
	}

	@Override
	public void update(Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContents(board.getContents()); //어떨 때 겟? 셋?
			}//title로 검색해서 내용 수정
		}
	}

	@Override
	public void delete(String title) {
		for(int i=0; i<list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void show() {
		for(Board board : list) {
			System.out.println(board.toString());
		}
	}
	
}
