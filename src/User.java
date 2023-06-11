import java.util.ArrayList;
import java.util.Arrays;

public class User {

    /**
     * This will store the first name
     * of the user.
     */
    private String firstName;

    /**
     * this will store the last name
     * of the user.
     */
    private String lastName;

    /**
     * This will store the ID number of the user.
     */
    private String uuid;

    /**
     * The MD5 hash of the user's PIN.
     */
    private byte pinHash[];

    /**
     * This will store the list of accounts for
     * the specific user.
     */
    private ArrayList<Account> accounts;
}
