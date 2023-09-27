import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		
        System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
        scanner.close();
		try {
            
			if(parametroUm < parametroDois){
            contar(parametroUm, parametroDois);
            } else {
                throw new InputMismatchException();
            }
        
        
		}catch (InputMismatchException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        
    }
	}
	static void contar(int parametroUm, int parametroDois ) throws InputMismatchException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int numero = 1; numero <= contagem; numero++){
            System.out.println("Imprimindo Numero dos parametros: " + numero);
        }
	}
}