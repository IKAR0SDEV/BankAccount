package bankaccount;

/**
 *
 * @author khali
 */
public class AccountOwner {

    ///global variables of the class to be added in ArrayList  
    private final String userName; //final because username never 
    private final String address; //final because address never changes
    private final String postcode; //final because postcode never changes
    private String date;
    private final Account account; //final because account never changes

    //Constructor
    AccountOwner(String userName, String address, String postcode, String date, Account account) {
        this.userName = userName;
        this.address = address;
        this.postcode = postcode;
        this.date = date;
        this.account = account;
    }

    // Print in console account information
    @Override
    public String toString() {
        return "\nCustomer Information\n"
                + "Name: " + userName + "\n"
                + "Address: " + address + "\n"
                + "Postcode: " + postcode + "\n"
                + "Account Open date: " + date + "\n"
                + account;
    }

    //getter method for account
    Account getAccount() {
        return account;
    }

    //getter method for username
    String getUserName() {
        return userName;
    }

    //getter method for address
    String getAddress() {
        return address;
    }

    //getter method for postcode
    String getPostcode() {
        return postcode;
    }

    //getter method for date
    String getDate() {
        return date;
    }
}
