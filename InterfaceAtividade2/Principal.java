package InterfaceAtividade2;

public class Principal {

	public static void main(String[] args) {
		Adicionar  adicionar = new Adicionar();
		System.out.println(" A Soma:"+ adicionar.Somar(9, 4));

		Subtrair subtrair = new Subtrair();
		System.out.println(" A Subtração:"+subtrair.Sub(7, 4));

		Calcular calcular = new Calcular();
		System.out.println(" A Divisão:"+calcular.Div(12, 6)); 
		System.out.println(" A Multiplicação:"+calcular.Mult(7, 4));

		Expo expoente = new Expo();
		System.out.println(" O Expoente:"+ expoente.Exp(10, 8));


	}

}
