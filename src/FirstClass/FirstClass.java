package FirstClass;

public class FirstClass {
	
	int a = 5;
	public String getData() {
	System.out.println("I am in a method");
	return "Hello";
	}
	
	public static void main(String[] args) {
		
		FirstClass fc = new FirstClass();
		fc.getData();
		SecondClass sc = new SecondClass();
		sc.getData();
		System.out.println(fc.a);
		System.out.println("HI");
		System.out.println("Hello World");
	}

}
