package chap10.ioexception;

import java.util.Random;
import java.io.*;

public class TestData 
{
	public static void main(String[] args) throws IOException // 
	{
		final int MAX = 10;
		int value;
		String file = "test.dat";
		
		Random rand = new Random();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw); // 让输出流具有缓存能力
		PrintWriter outFile = new PrintWriter(bw);
		
		for(int line=1; line <= MAX; line++)
		{
			for(int num=1; num <= MAX; num++)
			{
				value = rand.nextInt(90) + 10;
				outFile.print(value + "  ");
			}
			outFile.println();
		}
		
		outFile.close(); // 关闭文件流
		System.out.println("output file has been created:" + file);
	}
}
