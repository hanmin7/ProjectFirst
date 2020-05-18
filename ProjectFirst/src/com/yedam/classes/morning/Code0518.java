package com.yedam.classes.morning;

public class Code0518 {
	public static void main(String[] args) {
		//크기비교 후 정렬
		int[] intAry = {10, 8, 5, 3, 7, 1};
		int temp = 0;
		
		for(int i=0; i < intAry.length; i++ ) {
			for(int j=0; j < intAry.length; j++) {
				
				if(intAry[i] < intAry[j]) {
					temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = temp;
				}
				
			}

		} 
		System.out.print(intAry[0] +" "+ intAry[1] +" "+ intAry[2] +" "+ intAry[3] +" "+ intAry[4] +" "+ intAry[5]);
		
		
		for(int i=0; i < intAry.length; i++ ) {
			for(int j=0; j < (intAry.length)-1; j++) {
				
				if(intAry[j] > intAry[j+1]) {
					temp = intAry[j];
					intAry[j] = intAry[j+1];
					intAry[j+1] = temp;
				}
				
			}

		} 
		System.out.println();
		System.out.print(intAry[0] +" "+ intAry[1] +" "+ intAry[2] +" "+ intAry[3] +" "+ intAry[4] +" "+ intAry[5]);
		
		
		//최소값이용해서는???
		int minValue = Integer.MAX_VALUE;
	
			
			for(int i = 0; i < intAry.length; i++) {
				if(intAry[i] < minValue)
				minValue = intAry[i];
			}
			System.out.println();
			System.out.println(minValue);
	
		
	}
	
}
