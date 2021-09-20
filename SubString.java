package week3.day1;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="I am working with Java8";
		String str=sentence.replace("8","11");
		System.out.println("Replaced String is"+" "+str);
		char chr='#';
		String newsen=str+chr;
		System.out.println("New Sentence with #"+" "+newsen );
		System.out.println("Print the characters from 5 to 14:"+" "+newsen.substring(5,14));

	}

}
