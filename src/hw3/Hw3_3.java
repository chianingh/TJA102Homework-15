package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數
public class Hw3_3 {
	public static void main(String[] args) {
		int i;
		int count = 0;
		int linecount = 0;
		// 取得鍵盤輸入的內容
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int data = sc.nextInt();

		for (i = 1; i < 50; i++) {
			int ones = i % 10; // 個位數
			int tens = i / 10; // 十位數

			if (ones == data || tens == data) {
				continue;
			} else {
				System.out.print(i + " ");
				count++;
				linecount++;
				if(linecount % 6 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("共:" + count);
		
		
	}
}
