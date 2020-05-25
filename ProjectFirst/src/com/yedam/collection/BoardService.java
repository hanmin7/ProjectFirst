package com.yedam.collection;

import java.util.List;

public interface BoardService {
	void insert(List<Board> list, Board board);
	void update(List<Board> list, Board board);
	void delete(List<Board> list, Board board); 
	void select(List<Board> list, Board board);
}
