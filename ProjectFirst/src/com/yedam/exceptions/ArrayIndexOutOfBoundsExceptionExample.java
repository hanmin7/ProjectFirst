package com.yedam.exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[3];

		for (int i = 0; i <= intAry.length; i++) {
			try {
				intAry[i] = i + 1;
				System.out.println(intAry[i]);
				int num1 = Integer.parseInt(args[0]); //-여기서 문제는 변환불가
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다. intAry[" + i + "]");
			} catch (NumberFormatException e1) {
				System.out.println("변환 불가");
			} catch (Exception e2) {
				System.out.println("알수 없는 오류 발생");
			} //catch의 위치도 중요. e2 얘를 맨위로 올리면 나머지가 도달할필요가없어서 지우라고 나옴.
		}
		System.out.println("end of prog");
	} //여기서는 에러가 없어 보임. 근데 컴파일하면 에러가 남. 범위 벗어남
}
