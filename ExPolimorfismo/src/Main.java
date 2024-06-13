import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Digite o numero de funcionarios: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee "+ i + " data");
            System.out.println("O funcionário é terceirizado? (Y/N): ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite o nome do Funcionario: ");
            String name = sc.nextLine();
            System.out.println("Digite a quantidade de horas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valuePerHour = sc.nextDouble();

            if(ch == 'y' || ch == 'Y'){
                System.out.println("Digite o valor adicional: ");
                double addicionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name,horas,valuePerHour,addicionalCharge);
                list.add(emp);

            }
            else{
                Employee emp = new Employee(name,horas,valuePerHour);
                list.add(emp);
            }

            System.out.println();
            System.out.println("Pagamentos:");
            for(Employee emp : list){
                System.out.println(emp.getName() + "- $ - "   + String.format("%.2f",emp.payment()));
            }

        }



    }
}