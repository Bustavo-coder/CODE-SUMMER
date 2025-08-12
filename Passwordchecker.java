import java.util.Scanner;
public class Passwordchecker{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Password");
		String password = input.nextLine();
		System.out.println(getPassword(password));

		}
	public static String getPassword(String userPassword){
	String password = "secret123";
	if(userPassword.equalsIgnoreCase(password)) return "Access granted! Welcome!";
	else return "Access denied!";

		}



	}