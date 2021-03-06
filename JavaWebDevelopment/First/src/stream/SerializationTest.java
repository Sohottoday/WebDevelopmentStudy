package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person1 implements Serializable{
//class Person implements Externalizable : Serializable 은 구현할 수 있는 인터페이스가 없지만 Externalizable은 구현할 수 있는 인터페이스가 존재한다.
// writeExternal과 readExternal이 존재한다. 읽고 쓰는것을 직접 구현할 수 있다.
	String name;
	transient String job;		// transient 를 사용하면 직렬화 되지 않는다.
	
	public Person1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {

		Person1 personLee = new Person1("이순신", "엔지니어");
		Person1 personKim = new Person1("김진우", "선생님");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person1 p1 = (Person1)ois.readObject();
			Person1 p2 = (Person1)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch(IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
