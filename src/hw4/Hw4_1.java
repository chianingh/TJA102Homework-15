package hw4;
//有個一維陣列如下:

//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class Hw4_1 {
	public static void main(String[] args) {
		int a[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		double avg;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;

		System.out.println("sum = " + sum);
		System.out.println("avg= " + avg);

		for (int i = 0; i < a.length; i++) {
			if (a[i] > avg) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
