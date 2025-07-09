package hw7;

//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw7_3 {
	public static void main(String args[]) {
		Hw7_3 test = new Hw7_3();
		test.copyFile("C:/TJA102_Workspace/Homework-15/src/hw7/Sample.txt",
				"C:/TJA102_Workspace/Homework-15/src/hw7/Sample_1.txt");

	}

	void copyFile(String sourcePath, String targetPath) {

		try (FileInputStream in = new FileInputStream(sourcePath);
				FileOutputStream out = new FileOutputStream(targetPath)) {

			byte[] buffer = new byte[1024]; // 每次處理 1KB
			int length;
			while ((length = in.read(buffer)) != -1) { // 讀取檔案中下一段(buf.length個byte)資料，並放入陣列buf裡
														// 回傳值為實際讀取到的byte數量，如回傳-1代表已到檔案末端
				out.write(buffer, 0, length); // void write(byte[] buf, int offset, int length)
												// 將陣列buf中從offset位置開始的length個位元組(byte)資料寫至目的地
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
