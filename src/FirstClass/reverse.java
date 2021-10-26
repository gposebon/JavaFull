package FirstClass;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Guillermo"
				+ "";
		String t = "";
		for(int i = a.length() -1; i >= 0; i--) {
			t += a.charAt(i);
		}
		
		if (a.toLowerCase().equals(t.toLowerCase())) {
			System.out.println("La palabra es palindromo");
		}
		else {
			System.out.println("No son palindromo");
		}
	}

}
