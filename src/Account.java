import java.util.ArrayList;

public class Account {

    /**
     * This will store the name of the account.
     */
    private String accountName;

    /**
     * This will store the current balance of the
     * account.
     */
    private double accountBalance;

    /**
     * This will store the account ID.
     */
    private String uuid;

    /**
     * This will store the User object that is
     * owning this account.
     */
    private User accountHolder;

    /**
     * This will store the list of transactions for
     * this account.
     */
    private ArrayList<Transaction> transactions;
}
