package hw5;
// 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
// 可以找出二維陣列的最大值並回傳
public class Hw5_3 {
	public static void main(String[] args) {
		int[][] intArray = {
				   {1, 6, 3},
				   {9, 5, 2},
		          };
		double[][] doubleArray = {
				   {1.2, 3.5, 2.2},
				   {7.4, 2.1, 8.2},
		          };	
		
		Work03 w = new Work03();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}
}
