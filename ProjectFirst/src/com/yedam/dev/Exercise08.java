package com.yedam.dev;

public class Exercise08 {
	public static void main(String[] args) {
		
		int[][] array = new int[3][5];
		array[0] = new int[] {95, 86};
		array[1] = new int[] {83, 92, 96};
		array[2] = new int[] {78, 83, 93, 87, 88};
		
//		int[][] array = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
		
		int sum =0;
		double avg = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			avg += array[i].length;
//			avg += sum / array[i].length;
		}
			
		System.out.println("sum : " + sum);
//		System.out.println("avg : " + avg);
		System.out.println("avg : " + (double) sum / avg);
		
	}
}
