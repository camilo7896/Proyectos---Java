import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		//your code goes here

		int a = days * 24;
		int b = a * 60;
		int c = b*60; 
		System.out.println(days +" Horas tiene: "+ c + " Segundos");
	}
}