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
				list.get(i).setContents(board.getContents());
			}//title로 검색해서 내용 수정
		}
	}

	@Override
	public void delete(List<Board> list, Board board) {
		
	}

	@Override
	public void select(List<Board> list, Board board) {

	}
}
