import java.util.Scanner;
public class ScannerLearn{
	public static void main(String [] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number 01 :-");
		int num01=input.nextInt();
		System.out.println("Enter number 02 :-");
		int num02=input.nextInt();

		int total=num01+num02;
		System.out.println(total);
	}
}