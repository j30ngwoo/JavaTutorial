public class Casting {
	public static void main(String[] args) {
		double a = 1.1;
		double b = 1; // casting! int -> double
		System.out.println(a);
		System.out.println(b);

		int c = (int)1.1;
		System.out.println(c);

		int d = 123;
		String strI = Integer.toString(d);
		System.out.println(strI);
		System.out.println(strI.getClass());
	}
}
