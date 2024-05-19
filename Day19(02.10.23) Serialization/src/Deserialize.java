import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) {
		FileInputStream Fin = null;
		ObjectInputStream Oin = null;
		Employee e1 = null;
		
	try
		{
			Fin = new FileInputStream("serial.txt");
			Oin = new ObjectInputStream(Fin);
			e1 = (Employee)Oin.readObject();
			System.out.println(e1);
		}
	catch(FileNotFoundException e){}
	catch(IOException e){}
	catch(ClassNotFoundException e) {}	
	}

}
