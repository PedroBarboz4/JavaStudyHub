import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o numero de devedores: ");
		int numberContribuintes = sc.nextInt();

		List<Contribuintes> list = new ArrayList<>();
		int numeroFuncionarios;
		Double gastoMedico;

		for(int i = 0; i<numberContribuintes;i++){
			System.out.println("Devedor: "+ i + " data:");
			System.out.println("Individuo ou juridico? (I/J): ");
			char tipoContribuinte = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Receita Anual: ");
			double anualIncome = sc.nextDouble();
			if(tipoContribuinte == 'i' || tipoContribuinte == 'I'){
				System.out.println("Gastos médicos: ");
				gastoMedico = sc.nextDouble();
				list.add(new Indivudual(name,anualIncome,gastoMedico));
			}
			if(tipoContribuinte == 'j' || tipoContribuinte == 'J'){
				System.out.println("Numero de funcionários: ");
				numeroFuncionarios = sc.nextInt();
				list.add(new Juridica(name,anualIncome,numeroFuncionarios));
			}
			System.out.println("Taxas pagas: ");
			for(Contribuintes con: list){
				System.out.println(con.getName() + ": $" + con.tax());
			}


		}


	}
}
