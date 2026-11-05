import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double b){
        balance=b;
    }
    void withdrew(double amount){
        if (amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrew: $"+amount+", Balance: $"+balance);
        }
        else
            System.out.println("Not enough funds!");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting balance ");
        double balance=sc.nextDouble();

        BankAccount ba=new BankAccount(balance);
        System.out.println("Enter the amount you want to withdraw(P.S: enter 0 to exit)");
        double amount = sc.nextDouble();

        while (amount!=0 && ba.balance>0){
            ba.withdrew(amount);
            if (ba.balance>0){
                System.out.println("enter the new amount you want to withdraw:");
                amount=sc.nextDouble();
            }
        }
        System.out.println("Goodbye!");
    }
}