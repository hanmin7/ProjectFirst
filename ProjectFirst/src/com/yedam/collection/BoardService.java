package com.yedam.collection;

import java.util.List;

public interface BoardService {
	abstract void insert(List<Board> list, Board board); //추상메소드 구현클래스에서 {}정의
	void update(List<Board> list, Board board);
	void delete(List<Board> list, String title); 
	void show(List<Board> list);
}
