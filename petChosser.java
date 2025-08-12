public class petChosser{
	public static void main(String [] args){
		System.out.println(getPet("Dog"));
		System.out.println(getPet("Cat"));

		}
	public static String getPet(String animal){
		if(animal.equalsIgnoreCase("dog")) return "Woof! Dogs Are Awesome";
		else return "Cool choice, but i love dogs!";

		}



	}

