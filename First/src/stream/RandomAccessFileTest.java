package stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());		// getFilePointer : 위치를 알 수 있다.
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		rf.seek(0);		// seek 를 통해 특정 위치로 이동할 수 있다.
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		rf.close();
		
		
	}

}
