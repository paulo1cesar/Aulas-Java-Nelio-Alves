import java.util.Scanner;

public class postoCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int tipoCombustivel, ac, ga, di;
		ac = 0;
		ga = 0;
		di = 0;
		
		tipoCombustivel = sc.nextInt();
		
		
		while (tipoCombustivel != 4) {
			
			switch(tipoCombustivel) {
			case 1:
				ac += 1;
				break;
			case 2:
				ga += 1;
				break;
			case 3:
				di += 1;
				break;
			default:
				System.out.println("Digite um Numero de 1 a 3");
			}
			tipoCombustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + ac);
		System.out.println("Gasolina: " + ga);
		System.out.println("Diesel: " + di);
		
		sc.close();  
	}

}
