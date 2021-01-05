package bankaccount;

import java.util.*;

/**
 *
 * @author khali
 */
public class Bank {

    ArrayList<AccountOwner> accountOwners = new ArrayList<AccountOwner>(); //Creating account Owner ArrayList
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    //Add new account to ArrayList
    void addAccountOwner(AccountOwner accountOwner) {
        accountOwners.add(accountOwner);
    }

    void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    AccountOwner getAccountOwner(int account) {
        return accountOwners.get(account);
    }

    // make the arraylist returnable
    ArrayList<AccountOwner> getAccountOwners() {
        return accountOwners;
    }

    ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    // Get account number from ArrayList
    AccountOwner getByAccountNumber(int accountNumber) {
        AccountOwner accountOwner = null;
        for (AccountOwner a : accountOwners) {
            if (a.getAccount().getAccountNumber() == accountNumber) {
                accountOwner = a;
                break;
            }
        }
        return accountOwner;
    }

    //Delete account from Arraylist
    void deleteAccount(AccountOwner accountOwner) {
        accountOwners.remove(accountOwner);
    }

}
