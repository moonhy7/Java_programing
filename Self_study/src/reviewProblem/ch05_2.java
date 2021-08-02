package reviewProblem;

import java.util.Scanner;

public class ch05_2 {
	public static void main(String[] args) {
		//4번 
		int max = 0;
		int min = 10;
		int[] array = {1,5,3,8,2};
		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array.length; j++) {
//				if(array[i]>max) {
//					max = array[i];
//				}
//				if(array[i]<min) {
//					min = array[i];
//				}
//			}
//		}
//		System.out.println("max: "+ max);
//		System.out.println("min: "+ min);
//		
	
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("max: "+ max);
		
		
		
		
		//5번
		int[][] arr = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}	
			};

		int sum = 0;
		double avg = 0.0;
		int num = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].length);
			num += arr[i].length;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				avg = (double)sum/ num;
			}
		}	
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		
		// 6번
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[3];
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> ",i);
					scores[i] = Integer.parseInt(scn.nextLine());
				}
					
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d \n",i,scores[i]);
				}
			} else if(selectNo == 4) {
				int maxScore = 0;
				int sum1 = 0;
				for(int i=0; i<scores.length; i++) {
						if(scores[i]>maxScore) {
							maxScore = scores[i];
					}	sum1 += scores[i];
				}
				double avr = (double)sum1 / scores.length;
				System.out.printf("최고점수: %d \n",maxScore);
				System.out.println("평균점수: " + avr);
				
			} else if(selectNo == 5) {
				run = false;
			}		
		}
		System.out.println("프로그램 종료");
		
	}
	
}
