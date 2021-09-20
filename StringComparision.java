package week3.day1;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		} else if (str1.equalsIgnoreCase(str2)) {
			System.out.println("String comparision with equalsignorecase");
		} else if (str1 == str2) {

			System.out.println("String comparision using == operator");
		} else
			System.out.println("Strings are equal");

	}

}
