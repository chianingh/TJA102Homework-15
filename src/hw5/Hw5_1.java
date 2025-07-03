package hw5;

import java.util.Scanner;

// 請設計一個方法為starSquare(int width, int height),
// 當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
public class Hw5_1 {
	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int width = num.nextInt();
		int height = num.nextInt();

		starSquare(width, height);

	}

	public static void starSquare(int width, int height) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
