package com.yedam.collection;

import java.util.List;

public class BoardServiceImpl implements BoardService {

	@Override
	public void insert(List<Board> list, Board board) {
		list.add(board);

	}

	@Override
	public void update(List<Board> list, Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContents(board.getContents()); //어떨 때 겟? 셋?
			}//title로 검색해서 내용 수정
		}
	}

	@Override
	public void delete(List<Board> list, String title) {
		for(int i=0; i<list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void show(List<Board> list) {
		for(Board board : list) {
			System.out.println(board.toString());
		}
	}
}
