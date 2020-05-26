package com.yedam.collection;


public interface BoardService2 {
	abstract void insert(Board board);
	void update(Board board);
	void delete(String title); 
	void show();
}
