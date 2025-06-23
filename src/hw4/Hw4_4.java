package hw4;

import java.util.Scanner;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
public class Hw4_4 {
	public static void main(String[] args) {
		Scanner money = new Scanner(System.in);
		System.out.println("輸入欲借的金額:");
		
		int num = money.nextInt();
//		System.out.println(num);

		int array[][] = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] >= num) {
					count++;
					System.out.print("有錢可藉員工編號: " + array[i][0] + " ");
				}
			}
		}
		System.out.print("共" + count + "人");
	}
}

