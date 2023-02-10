package oops;

public class TestEmployee1 {

	public static void main(String[] args) {
		Address a1=new Address("Kochi", "Kerala", "Ernakulam");
		
		Employee1 employee1=new Employee1(1001, "Ajay", "Kochi, Kerala",a1);
		employee1.display();
	}

}
