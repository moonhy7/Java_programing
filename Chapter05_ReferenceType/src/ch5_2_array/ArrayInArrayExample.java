package ch5_2_array;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int i=0;i< mathScores.length; i++) { //행의 개수
			for(int k=0; k< mathScores[i].length; k++) { //열의 개수
				System.out.printf("mathScores[%d][%d] = %d\n", i,k,mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0;i< englishScores.length; i++) { //행의 개수
			for(int k=0; k< englishScores[i].length; k++) { //열의 개수
				System.out.printf("englishScores[%d][%d] = %d\n", i,k,englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95,80}, {92,96,80} };
		for(int i=0;i< javaScores.length; i++) { //행의 개수
			for(int k=0; k< javaScores[i].length; k++) { //열의 개수
				System.out.printf("javaScores[%d][%d] = %d\n", i,k,javaScores[i][k]);
			}
		}
	}
}
