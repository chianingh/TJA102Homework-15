package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//append功能讓每次執行結果都能被保存起來)
public class Hw7_2 {
	public static void main(String args[]) {

		try {

			FileOutputStream fos = new FileOutputStream("C:/TJA102_Workspace/Homework-15/src/hw7/Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			int r;
			for (int i = 0; i < 10; i++) {
				r = (int) (Math.random() * 1000) + 1;
				ps.println(r);
			}

			ps.close();
			bos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
