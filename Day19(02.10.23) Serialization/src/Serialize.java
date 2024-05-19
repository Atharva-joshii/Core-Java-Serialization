import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Sam",10000);
		FileOutputStream Fout = null;
		ObjectOutputStream OBJout = null;
		
		try
			{
				Fout = new FileOutputStream("Serial.txt");
				OBJout = new ObjectOutputStream(Fout);
				OBJout.writeObject(emp1);
				System.out.println("emp1 object is serialized");
			}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
		finally 
			{
				try 
				{
					Fout.close();
					OBJout.close();
				}
				catch(IOException e) {}
			}                                
	}

}
