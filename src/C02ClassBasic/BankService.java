package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class BankService {
//    public static void main(String[] args) {
//        List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("서비스 번호를 입력하세요 1. 개설, 2. 입금, 3. 출금, 4.");
//            int n = sc.nextInt();
//            if(n == 1) {
//                System.out.println("너의 계좌");
//                String account = sc.nextLine();
//                BankAccount bankAccount = new BankAccount(account);
//                bankAccounts.add(bankAccount);
//
//            }else if (n == 2) {
//                String account = sc.nextLine();
//                int money  = Integer.parseInt(sc.nextLine());
//                BankAccount bankAccount = new BankAccount();
//                for(int i = 0; i < bankAccounts.size(); i++) {
//                    if(bankAccounts.get(i).getAccountNumber().equals(account)) {
//                        bankAccounts.get(i).deposit(money);
//                    }
//                }
//            } else if (n == 3) {
//                String account = sc.nextLine();
//                int money  = Integer.parseInt(sc.nextLine());
//                BankAccount bankAccount = new BankAccount();
//                for(int i = 0; i < bankAccounts.size(); i++) {
//                    if(bankAccounts.get(i).getAccountNumber().equals(account)) {
//                        bankAccounts.get(i).withdraw(money);
//                    }
//                }
//            } else {
//                String myAccount = sc.nextLine();
//                String yourAccount = sc.nextLine();
//                int money  = Integer.parseInt(sc.nextLine());
//                BankAccount myBankAccount = null;
//                BankAccount yourBankAccount = null;
//                for(int i = 0; i < bankAccounts.size(); i++) {
//                    if(bankAccounts.get(i).getAccountNumber().equals(myAccount)) {
//                        myBankAccount = bankAccounts.get(i);
//                    }
//                    if(bankAccounts.get(i).getAccountNumber().equals(yourAccount)) {
//                        yourBankAccount = bankAccounts.get(i);
//                    }
//                }
//            }
//        }
//
//
////        BankAccount bank = new BankAccount("1234");
////        bank.deposit(50000);
////        BankAccount bank2 = new BankAccount("5678");
////        bank2.deposit(50000);
////        bank2.transfer(bank, 5000);
////        System.out.println(bank2.getBalance());
////        System.out.println(bank.getBalance());
//    }
//}
//
//class BankAccount {
//    private String accountNumber;
//    private int balance;
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public BankAccount(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//    public BankAccount() {
//
//    }
//    public void deposit(int money) {
//        this.balance += money;
//        System.out.println(money + "원 입금되었습니다" + "잔액은"+balance+"입니다");
//    }
//    public void withdraw(int money) {
//        this.balance -= money;
//        if (balance < money) {
//            System.out.println("잔액이 부족합니다");
//        } else {
//            System.out.println(money + "원 출금되었습니다" + "잔액은"+balance+"입니다");
//        }
//    }
//    public void transfer(BankAccount bankAccount, int money) {
//        this.balance -= money;
//        bankAccount.deposit(money);
//        System.out.println(bankAccount+"의" + balance + "입니다.");
//    }
//}
public class BankService {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        while (true){
            System.out.println("서비스 번호를 입력하세요. 1.개설 2.입금 3.출금 4.송금");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if(number == 1){
                System.out.println("계좌번호를 입력하세요");
                String accountNumber = sc.nextLine();
                BankAccount bankAccount = new BankAccount(accountNumber);
                bankAccounts.add(bankAccount);
            }else if (number == 2){
                System.out.println("계좌번호를 입력하세요");
                String accountNumber = sc.nextLine();
                System.out.println("얼마 입금하겠습니까?");
                int money = Integer.parseInt(sc.nextLine());
                for(int i=0; i<bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
                        bankAccounts.get(i).deposit(money);
                    }
                }
            }else if (number == 3){

            }else if( number == 4){
                System.out.println("본인 계좌번호를 입력하세요");
                String myNumber = sc.nextLine();
                System.out.println("상대방 계좌번호를 입력하세요");
                String yourNumber = sc.nextLine();
                System.out.println("얼마 입금하겠습니까?");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount myAccount = null;
                BankAccount yourAccount = null;
                for(int i=0; i<bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(myNumber)){
                        myAccount = bankAccounts.get(i);
                    }
                    if(bankAccounts.get(i).getAccountNumber().equals(yourNumber)){
                        yourAccount = bankAccounts.get(i);
                    }
                }
                myAccount.transfer(money, yourAccount);

            }
        }
    }
}
class BankAccount{
    private String accountNumber;
    private int balance;
    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void transfer(int money, BankAccount bankAccount){
        this.balance -= money;
        bankAccount.deposit(money);
        System.out.println("현재 잔액은 " + this.balance);
    }
    public void deposit(int money){
        this.balance += money;
        System.out.println(money+"원 입금되었습니다.");
        System.out.println("현재 잔액은 " + this.balance);
    }
    public void withdraw(int money){
        if(this.balance < money){
            System.out.println("잔액 부족입니다.");
        }else {
            this.balance -= money;
            System.out.println(money + "원 출금되었습니다.");
        }
        System.out.println("현재 잔액은 " + this.balance);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
}
