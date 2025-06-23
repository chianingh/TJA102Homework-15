package hw4;

import java.util.Arrays;

//  班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數
public class Hw4_6 {
	public static void main(String[] args) {
		int a[][] = { 
				{ 1, 2, 3, 4, 5, 6, 7, 8 }, 
				{ 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 }, 
				{ 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 }, 
				{ 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 } 
				};
		
		// 每位學生最高分次數
		int count[] = new int[8];

		// 每次考試
		for (int i = 1; i < a.length; i++) {
			int maxScore = 0;

			// 1. 找出這次考試的最高分
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > maxScore) {
					maxScore = a[i][j];
				}
			}
			// 2. 找出哪些學生考到這個最高分
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] == maxScore) {
					count[j]++;
				}
			}
		}
		// 3. 印出每位學生的最高分次數
		for (int j = 0; j < count.length; j++) {
			System.out.println("學生 " + a[0][j] + " 考最高分次數:" + count[j]);
		}
	}
}
