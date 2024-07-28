import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("info.bin");
			dis = new DataInputStream(fis);
			
			int age = dis.readInt();
			String name = dis.readUTF();
			double height = dis.readDouble();
			boolean isMarried = dis.readBoolean();
			
			System.out.println(age+","+name+","+height+","+isMarried);
					
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis!=null) dis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
