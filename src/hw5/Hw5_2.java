package hw5;

// 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中
// 取平均值並印出這10個亂數與平均值
public class Hw5_2 {
	public static void main(String[] args) {

		randAvg();

	}

	public static void randAvg() {

		double sum = 0;
		System.out.println("本次亂數結果:");
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 101);
			System.out.print(r + " ");
			sum += r;
		}
		System.out.println();
		System.out.print("平均值:" + sum / 10);
	}
}
