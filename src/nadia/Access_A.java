package nadia;

public class Access_A {

int id = 120;
String name = "Nadia";
double salary = 2000;
static int age = 50;
	
	
	public static void main(String[] args) {
		int id1 = 100;
		
		Access_A obj = new Access_A();
		
		System.out.println(obj.id);
		System.out.println(obj.salary);
		
		System.out.println(Access_A.age);
		System.out.println(id1);
	}
}
