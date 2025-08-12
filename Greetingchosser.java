public class Greetingchosser{
	public static void main(String [] args){
		System.out.println(chooseGreter("alex"));
		System.out.println(chooseGreter("Fatai"));

		}
	public static String chooseGreter(String name){
		if(name.equalsIgnoreCase("alex")) return "Hello, Freind!";
		else return "Hi stranger!";
		
			}



	}

