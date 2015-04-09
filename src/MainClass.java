	import java.util.Scanner;


	public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 String email2 = "bytecode2015@gmail.com";
		 boolean isMatch;
		 

		 
		// System.in represents input stream
		 Scanner scanner = new Scanner(System.in);

		 // print() not println()
		 System.out.print("Enter your email: ");

		 // Store email
		 String email1 = scanner.nextLine();

		 // close when done!
		 scanner.close();
		 
		 isMatch = email1.equals (email2);
		 
		 if (isMatch == true){
			 
		 System.out.println("Emails Match!");
			 
		 }
		 
		 else{
			 System.out.println("Emails Dont Match");
		 }
		 

	}

}
