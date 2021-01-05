package bankaccount;

/**
 *
 * @author khali
 */
public class Transaction {

    private String transType;
    private double amount;
    private String date;

    Transaction(String transType, double amount, String date) {
        this.transType = transType;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction : " + transType + "\n"
                + "Amount: " + amount + "\n"
                + "Date: " + date;

    }

    String getTransType() {
        return transType;
    }

    double getAmount() {
        return amount;
    }

    String getDate() {
        return date;
    }

}
