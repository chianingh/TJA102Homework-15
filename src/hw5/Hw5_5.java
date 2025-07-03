package hw5;
//  身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//  genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//  與數字的亂數組合

//  0-9:  ASCII Code 48~57,  A-Z:  ASCII Code 65~90,  a-z:  ASCII Code 97~122 
public class Hw5_5 {
	public static void main(String[] args) {
		
		genAuthCode();
		
	}	
		public static void genAuthCode() {
			int num; 
			System.out.println("本次隨機產生驗證碼為:");
			for (int i = 0; i < 8; i++) {
				num = (int) (Math.random() * 75 + 48);  // 產生 48~12
				if((num > 57 && num < 65) || (num > 90 && num < 97)) {
					i--;// 若不是合法字元，重試
					continue;
				}
				System.out.print((char)num);
			}
			System.out.println();
			
		}
}
