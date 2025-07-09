package hw7;

import java.io.EOFException;
//1. 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//   注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//2. 請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw7_45 {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Cat cat = new Cat("Kitty");
		Cat cat1 = new Cat("Kitty1");
		Dog dog = new Dog("Puppy");
		Dog dog1 = new Dog("Puppy1");

		File folder = new File("C:\\data");
		if (!folder.exists()) {
			folder.mkdir();
		}

		// 輸出
		FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(cat); // 把cat物件寫入檔案
		oos.writeObject(cat1);
		oos.writeObject(dog); // 把dog物件寫入檔案
		oos.writeObject(dog1);

		oos.close();

		// 輸入
		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				Animal animal = (Animal) ois.readObject();
				animal.speak();
			}
		} catch (EOFException e) {

		}

	}

	// Cat 和 Dog 共通的介面
	public interface Animal {
		void speak();
	}
}
