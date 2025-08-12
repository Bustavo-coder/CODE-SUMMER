import java.util.Scanner;
public class Evenodd{
	public static void main(String [] args){
		System.out.println( getEven(100));
		System.out.println( getEven(11));

		}
public static String getEven(int number){
		if(number % 2 == 0) return "Even";
		else return "Odd";
		}



	}
