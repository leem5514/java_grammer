package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C0206Service {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("서비스 번호를 입력하세요 1. 개설, 2. 입금, 3. 출금, 4.");
            int n = sc.nextInt();
            if(n == 1) {
                System.out.println("너의 계좌");
                String account = sc.nextLine();
                BankAccount bankAccount = new BankAccount(account);
                bankAccounts.add(bankAccount);

            }else if (n == 2) {
                String account = sc.nextLine();
                int money  = Integer.parseInt(sc.nextLine());
                BankAccount bankAccount = new BankAccount();
                for(int i = 0; i < bankAccounts.size(); i++) {
                    if(bankAccounts.get(i).getAccountNumber().equals(account)) {
                        bankAccounts.get(i).deposit(money);
                    }
                }
            } else if (n == 3) {
                String account = sc.nextLine();
                int money  = Integer.parseInt(sc.nextLine());
                BankAccount bankAccount = new BankAccount();
                for(int i = 0; i < bankAccounts.size(); i++) {
                    if(bankAccounts.get(i).getAccountNumber().equals(account)) {
                        bankAccounts.get(i).withdraw(money);
                    }
                }
            } else {
                String myAccount = sc.nextLine();
                String yourAccount = sc.nextLine();
                int money  = Integer.parseInt(sc.nextLine());
                BankAccount myBankAccount = null;
                BankAccount yourBankAccount = null;
                for(int i = 0; i < bankAccounts.size(); i++) {
                    if(bankAccounts.get(i).getAccountNumber().equals(myAccount)) {
                        myBankAccount = bankAccounts.get(i);
                    }
                    if(bankAccounts.get(i).getAccountNumber().equals(yourAccount)) {
                        yourBankAccount = bankAccounts.get(i);
                    }
                }
            }
        }


//        BankAccount bank = new BankAccount("1234");
//        bank.deposit(50000);
//        BankAccount bank2 = new BankAccount("5678");
//        bank2.deposit(50000);
//        bank2.transfer(bank, 5000);
//        System.out.println(bank2.getBalance());
//        System.out.println(bank.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BankAccount() {

    }
    public void deposit(int money) {
        this.balance += money;
        System.out.println(money + "원 입금되었습니다" + "잔액은"+balance+"입니다");
    }
    public void withdraw(int money) {
        this.balance -= money;
        if (balance < money) {
            System.out.println("잔액이 부족합니다");
        } else {
            System.out.println(money + "원 출금되었습니다" + "잔액은"+balance+"입니다");
        }
    }
    public void transfer(BankAccount bankAccount, int money) {
        this.balance -= money;
        bankAccount.deposit(money);
        System.out.println(bankAccount+"의" + balance + "입니다.");
    }
}
