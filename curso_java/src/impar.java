import java.util.Scanner;

public class impar {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if (num % 2 != 0){
			System.out.println("IMPAR");
		}else {
			System.out.println("PAR");
		}
			
		sc.close();
	}

}
