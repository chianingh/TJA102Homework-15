package hw7;
//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:

//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
	public static void main(String args[]) {
		File f = new File("C:/TJA102_Workspace/Homework-15/src/hw7/Sample.txt");
		long numBytes = f.length(); // 位元組
		int numLines = 0;
		int numChars = 0;

		try {
			// 用 BufferedReader 逐行讀取檔案
			BufferedReader reader = new BufferedReader(new FileReader(f));

			String line;
			while ((line = reader.readLine()) != null) {
				numLines++; // 每讀到一行就 +1
				numChars += line.length(); // 加總每一行的字元數

			}
			reader.close();
			System.out.println(f.getName() + " 檔案共有 " + numBytes + " 個位元組, " + numChars + " 個字元, " + numLines + " 列資料");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
