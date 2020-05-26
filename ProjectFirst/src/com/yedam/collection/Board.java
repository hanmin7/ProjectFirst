package com.yedam.collection;

public class Board {
	private String name;
	private String title;
	private String contents;
	
	Board(String title, String contents, String name) {
		this.name = name;
		this.title = title;
		this.contents = contents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "제목: " + title + ", " + "내용: " + contents + ", " +"작성자: " + name;
	}
	
	
}
