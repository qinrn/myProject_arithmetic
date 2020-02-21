package train.java.io.FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_writer {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/train/java/io/FileWriter/Copy_writer.java");
		FileWriter fw = new FileWriter("src/train/java/io/FileWriter/file03");
		
		char[] chars = new char[512];
		while(true) {
			int temp = fr.read(chars);
			if (temp == -1) break;
			
			fw.write(chars);
		}
		
//		int temp = 0;
//		while((temp = fr.read(chars))!=-1) {
//			fw.write(chars,0,temp);
//		}
		
		fw.flush();
		fr.close();
		fw.close();
				
		
	}

}
