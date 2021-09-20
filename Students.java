package week3.day1;


public class Students {

	public void getStudentInfo(int id){
		System.out.println("ID:"+" "+id);
		
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("ID:"+" "+id);
		System.out.println("Name:"+" "+name);
		//System.out.println("Email:"+" "+email);
		
	}
	public void getStudentInfo(String email,long phone ) {
		
		System.out.println("Email:"+" "+email);
		System.out.println("Phone:"+" "+phone);
		
	}
	
	
	public static void main(String[] args) {
		Students info=new Students();
		info.getStudentInfo(1001);
		info.getStudentInfo(1001,"Sahithya");
		info.getStudentInfo("sahithya@gmail.com", 987654321);
	}
	
	}
