import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		while (numero!=aleatorio) {
			System.out.println("introduce el numero, por favor");
			
			numero=entrada.nextInt();
			
			if (aleatorio<numero) {
				System.out.println("mas bajo");
			}
			else if (aleatorio>numero) {
				System.out.println("mas alto");
			}
		}
		System.out.println("Correcto");
	}

}
