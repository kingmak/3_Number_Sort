import java.util.Scanner;

public class Sort3{
    public static void main(String[] args){

		Scanner Input = new Scanner(System.in); 
		
		System.out.print("Give me the value of a: "); 
		double a = Input.nextDouble(); 
	       
		System.out.print("Give me the value of b: ");
		double b = Input.nextDouble(); 
		
		System.out.print("Give me the value of c: "); 
		double c = Input.nextDouble(); 
		Input.close();

		double tempBig, tempSmall, big, middle, small; 

		if (a > b){
			tempBig = a;
			tempSmall = b;
		}

		else {
			tempBig = b;
			tempSmall = a;
		}

		if (c > tempBig){
			big = c;
			middle = tempBig;
			small = tempSmall;
		}

		else {
			big = tempBig;
			if (tempSmall > c){
				middle = tempSmall;
				small = c;
			}

			else{
				middle = c;
				small = tempSmall;
			}
		}

		System.out.printf("%n%.3f, %.3f, %.3f", small, middle, big);
	}
}
