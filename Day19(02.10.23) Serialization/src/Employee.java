import java.io.Serializable;

public class Employee implements Serializable {
	private int Id;String name;double Salary;
	
	public Employee(int i,String n,double s) {
		this.Id=i;
		this.name=n;
		this.Salary=s;
	}
	
	public String toString() {
		return Id+" "+name+" "+Salary;
	}
	
	public void display() {
		System.out.println("Emp id ="+Id+"Emp name = "+name+"Emp Salary = "+Salary);
	}

}
