package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Account> accounts = new ArrayList<>();

		accounts.add(new SavingsAccount(1001,"Alex",500.00,0.01));
		accounts.add(new BusinessAccount(1002,"Maria",1000.00,400.00));
		accounts.add(new SavingsAccount(1003,"bob",300.00,0.01));
		accounts.add(new BusinessAccount(1004,"Ana",500.00,500.00));

		double sum = 0;
		for (Account account : accounts) {
			sum += account.getBalance();
		}

		System.out.printf("Total balance: %.2f%n",sum);

		for(Account account : accounts) {
			account.deposit(10);
		}

		for(Account account : accounts) {
			System.out.printf("Updated balance for account %d: %.2f%n", account.getNumber(),account.getBalance());
		}
	}
}
