package hw3;

import java.util.Scanner;

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
class Hw3_2 {
	public static void main(String[] args) {
//		// 亂數產生一個0~9的數字
//		int i = (int) (Math.random() * 9);
//
//		System.out.println("開始猜數字吧!");
//
//		while (true) {
//			// 取得鍵盤輸入的內容
//			Scanner sc = new Scanner(System.in);
//			int data = sc.nextInt();
//			if (i != data) {
//				System.out.println("猜錯囉");
//				continue;
//			} else {
//				break;
//			}
//
//		}
//		System.out.println("答對了!答案就是" + i);

//(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		// 亂數產生一個0~100的數字
		int i = (int) (Math.random() * 101);

		System.out.println("開始猜數字吧!");

		while (true) {
			// 取得鍵盤輸入的內容
			Scanner sc = new Scanner(System.in);
			int data = sc.nextInt();
			if (i > data) {
				System.out.println("小於正確答案");
				continue;
			} else if (i < data) {
				System.out.println("大於正確答案");
				continue;
			} else {
				break;
			}

		}
		System.out.println("答對了!答案就是" + i);
	}
}
