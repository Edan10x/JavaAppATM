import java.util.Date;

public class Transaction {

    /**
     * This will store the amount of the transaction.
     */
    private double amount;

    /**
     * This will generate the time and date of this
     * transaction.
     */
    private Date timestamp;

    /**
     * This will store the memo for this transaction.
     */
    private String memo;

    /**
     * This will show in which the transaction was
     * performed.
     */
    private Account inAccount;
}
