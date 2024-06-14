package C04Interface.BankService;

// 실 비지니스 로직이 동작하는 코드가 Service 코드
public class BankKakaoService implements BankService {

        @Override
        public void deposit(int money, BankAccount bankAccount) {
            int myMoney = bankAccount.getBalance(); //get
            int totalMoney = myMoney + money;
            bankAccount.updateBalance(totalMoney); //set
            System.out.println(money + "원 kakao 입금되었습니다.");
            System.out.println("현재 잔액은 " + totalMoney);
        }

        @Override
        public void withdraw(int money, BankAccount bankAccount) {
            if (bankAccount.getBalance() < money) {
                System.out.println("잔액 부족입니다.");
            } else {
                int totalMoney = bankAccount.getBalance() - money;
                bankAccount.updateBalance(totalMoney);
                System.out.println(money + "원 kakao 출금되었습니다.");
                System.out.println("현재 잔액은 " + totalMoney);
            }
        }

}