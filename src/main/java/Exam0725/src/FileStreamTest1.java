import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("news.txt");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("weather.txt");
			bos = new BufferedOutputStream(fos);
			
			byte[] buff = new byte[100];
			int len;
			while((len=bis.read(buff))>0) {
				bos.write(buff,0,len);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
				if(bos!=null) bos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
