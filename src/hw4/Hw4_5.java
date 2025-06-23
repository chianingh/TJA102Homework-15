package hw4;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
import java.util.Scanner;

public class Hw4_5 {
	public static void main(String[] args) {

		// 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日
		Scanner time = new Scanner(System.in);
		System.out.println("請分別輸入yyyy年,mm月,dd日:");

		int yy = time.nextInt();
		int mm = time.nextInt();
		int dd = time.nextInt();
		System.out.println(yy + "年" + mm + "月" + dd + "日");

		int num[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monDays = 0;
		int allday;

		// 閏年條件:公元年份為4的倍數但非100的倍數or公元年份為400的倍數
		if (((yy % 4 == 0 )&& (yy % 100 != 0))||(yy % 400 == 0) ) {
			num[1] = 29;
		}

		// 擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		if (dd > num[mm - 1]) {
			System.out.println("輸入錯誤");
		} else {

			if (mm > 1) {
				for (int i = 0; i < mm-1; i++) {
					monDays += num[i];
				}
			}
			allday = monDays + dd;
			System.out.println("輸入的日期為該年第" + allday + "天");
		}
	}
}
