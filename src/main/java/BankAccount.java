
/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {

        /** checking account. */
        CHECKINGS,

        /** savings account. */
        SAVINGS,

        /** student account. */
        STUDENT,

        /** workplace acccount. */
        WORKPLACE
    }

    /** the account number. */
    private int accountNumber;

    /** the bank account type. */
    private BankAccountType accountType;

    /** the account balance. */
    private double accountBalance;

    /** the owner's name. */
    private String ownerName;

    /** the interest rate. */
    private double interestRate;

    /** the interest earned. */
    private double interestEarned;

    /**
     *
     * @param name the name of the owner
     * @param accountCategory the bank account type.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param newAccountNumber the account number.
     */
    public void setAccountNumber(final int newAccountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return the bank account type.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }


    /**
     *
     * @param newAccountType the account type.
     */
    public void setAccountType(final BankAccountType newAccountType) {
        this.accountType = accountType;
    }

    /**
     *
     * @return the account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param newAccountBalance the account balance.
     */
    public void setAccountBalance(final double newAccountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     *
     * @return the owner's name.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param newOwnerName the owner's name.
     */
    public void setOwnerName(final String newOwnerName) {
        this.ownerName = ownerName;
    }

    /**
     *
     * @return the interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param newInterestRate the interest rate.
     */
    public void setInterestRate(final double newInterestRate) {
        this.interestRate = interestRate;
    }

    /**
     *
     * @return the interest earned.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param newInterestEarned the interest earned.
     */
    public void setInterestEarned(final double newInterestEarned) {
        this.interestEarned = interestEarned;
    }
}