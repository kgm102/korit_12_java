package ch10_acess_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
    Bank bank1 = new Bank();
    Bank bank2 = new Bank();

    bank1.setAccountNum(123456);
    bank1.setAccountHolder("홍길동");
    bank1.setBalance(-5000);
    bank1.setBalance(100000);
    bank1.setPinNumber(80000);
    bank1.setPinNumber(6587);

    bank2.setAccountNum(987654);
    bank2.setAccountHolder("신사임당");
    bank2.setBalance(500000);
    bank2.setPinNumber(9658);

    System.out.println();
    bank1.showAccountInfo();
    System.out.println();
    bank1.deposit(50000, 6587);
    bank1.withdraw(200000,6587);
    bank1.withdraw(100000,6587);

    System.out.println();
    bank2.showAccountInfo();
    System.out.println();
    bank2.withdraw(100000,9658);
    bank2.deposit(200000, 9658);
    System.out.println();

    bank1.showAccountInfo();
    bank2.showAccountInfo();




    }
}
