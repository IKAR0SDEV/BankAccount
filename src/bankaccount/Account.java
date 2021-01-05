package bankaccount;

/**
 *
 * @author khali
 */
import javax.swing.*;

public class Account {

    private double balance;
    private int accountNumber;
    private double initialBalance = 0;
    private static int nAccounts = 100001;

    //Constructor
    Account(double initialBalance) {
        accountNumber = nAccounts++; //new account numbers will increase by 1 when a new account is created
        this.setBalance(initialBalance);
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    //Withdraw money from account
    public void withdraw(double money) {
        if (money > balance) {

            JOptionPane.showMessageDialog(null, "Insufficient money in the account", "Invalid Input!", JOptionPane.WARNING_MESSAGE);
            return; // error occured; exit the method early
        }
        balance -= money;
        JOptionPane.showMessageDialog(null, "You have withdrawn: " + money + "\n Your new balnce is " + balance, "", JOptionPane.INFORMATION_MESSAGE);
    }

    //Deposit money from account
    public void deposit(double money) {
        if (money < 0) {
            JOptionPane.showMessageDialog(null, "Deposited money cannot be negative", "Invalid Input!", JOptionPane.WARNING_MESSAGE);
            return; // error occured; exit the method early
        }
        balance = balance + money;
        JOptionPane.showMessageDialog(null, "You have deposited: " + money + "\n Your new balance is " + balance, "", JOptionPane.INFORMATION_MESSAGE);
    }

}
