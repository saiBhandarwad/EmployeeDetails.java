//Create a simple program to model a basic employee system. You need to create a superclass called Employee that contains common properties such as name and salary, and a method to display employee details. Then, create a subclass called Manager that extends Employee and adds a property for department. The Manager class should also override the method to display the details, including the department.

class Employee
{
	String name;
	Float salary;
	Employee(){};
	Employee(String name, Float salary)
	{
		this.name = name;
		this.salary = salary;
	};

	void display()
	{
		System.out.println("name: "+ name + " salary: "+salary);
	};
}
class Manager extends Employee
{
	String department;
	
	Manager(String name, float salary, String dep)
	{
		super(name,salary);
		this.department = dep;
	};
	
	void display()
	{
		System.out.println("name: "+ super.name + " salary: "+ super.salary + " department: "+department);
	};

}

class EmployeeDetails
{
	public static void main(String[] args)
	{
		Employee emp = new Employee("sidharth", 9.2f);
		Manager man = new Manager("ASHISH",9.9F,"MCA");
		emp.display();
		man.display();
	}

}