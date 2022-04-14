package nadia;

public class Access_B {

	public static void main(String[] args) {
		
		Access_A ob = new Access_A();
		System.out.println(ob.name);
		
		System.out.println(Access_A.age);
	}
}
