package com.yedam.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample2 {
	public static void main(String[] args) {
		// paths의 경로나 이름이 잘못되었을 때 파일읽을 수없음 나타냄.
		String paths = "src/com/yedam/exceptions/AccountExample.java";
		try (FileInputStream fis = new FileInputStream(paths)) { //이렇게 쓰면 TryWithResourceExample파일에서의 close 적지않아도 됨.
			int readByte;
			while((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		}
		
	}//main
}
