package hw3;
//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰

//三角形、其它三角形或不是三角形

import java.util.Scanner;

public class Hw3_1 {
	public static void main(String[] args) {
		//取得鍵盤輸入的內容
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數邊長：");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();

		// 先將三邊排序，確保最大邊為 c
		int a = Math.min(data1, Math.min(data2, data3));
		int c = Math.max(data1, Math.max(data2, data3));
		int b = data1 + data2 + data3 - a - c;

		// 三角形不等式定理: 三角形的任意兩邊之和必須大於第三邊，這必須對三組邊都成立
		if ((a + b) > c) {
			if (a == b && b == c) {
				System.out.println("正三角形");
			} else if ((a == b) || (b == c) || (a == c)) {
				System.out.println("等腰三角形");
			} else if (a * a + b * b == c * c) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}
}
