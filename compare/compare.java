package compare;

public class compare {

	public static void main(String[] args) {
		// ºñ±³ true, false,
		// ==, <, >, >=, <=
		
		System.out.println(10 == 10);
		System.out.println(10 == 20);
		System.out.println(10 != 20);
		System.out.println(10 < 20);
		System.out.println(30 <= 30);
		
		// .equals
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b);
		System.out.println(a.contentEquals(b));
		
		System.out.println("one" != "two");
		System.out.println("one" != "one");
		
	}

}
