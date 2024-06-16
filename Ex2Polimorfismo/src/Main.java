import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedPrice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> list =new ArrayList<>();
        System.out.println("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        for(int i=0;i<=numberProducts;i++){
            System.out.println("Product #" + i + "data");
            System.out.println("Common, user or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            if(ch == 'c'){
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                Double price = sc.nextDouble();
                System.out.println("CustomFee: ");
                double customFee = sc.nextDouble();
                Product prod = new ImportedProduct(name,price,customFee);
                list.add(prod);
            }
            if(ch == 'u'){
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                Double price = sc.nextDouble();
                System.out.println("Manufacture Date (dd/mm/yyyy): ");
                Date date = sdf.parse(sc.next());
                Product prod = new UsedPrice(name,price, (java.sql.Date) date);
                list.add(prod);
            }if(ch == 'u') {
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                Double price = sc.nextDouble();
                Product prod = new Product(name,price);
                list.add(prod);
            }else{System.out.println("Opção invalida!");}

            for(Product prod : list){
                System.out.println(prod.priceTag());
            }
        }
    }
}