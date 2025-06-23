package hw4;

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
public class Hw4_3 {
	public static void main(String[] args) {
		int count = 0;
		String arry[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		for (int i = 0; i < arry.length; i++) {
			String word = arry[i];
			for (int j = 0; j < word.length(); j++){
				char z = word.charAt(j);
				if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u') {
					count ++;
				}else {
					
				}
			}
		}
		System.out.println("共有多少個母音" + count);
	}
}
