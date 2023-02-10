package oops;

public class Employee1 {

	int empId;
	String empName,empAddress;
	
	Address address;
	public Employee1( int empId,String empName, String empAddress,Address address) {
		this.empId=empId;
		this.empName=empName;
		this.empAddress=empAddress;
		this.address=address;
	}
	void display()
	{
		System.out.println("Id: "+empId+" Name: "+empName+" Address: "+empAddress+" Address in detail "+address.city+","+address.state+","+address.district);
	}
	
}
