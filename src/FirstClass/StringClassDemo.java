package FirstClass;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = " JavaTraining";
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(1, 6));
		System.out.println(a.substring(3));
		System.out.println(a.concat(" GPP Teacher"));
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[] = a.split("T");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("T", "s"));
	}

}
