public class BankAccount {
    private Boolean closed = true;
    private Integer balance;

    void open() throws BankAccountActionInvalidException {
        synchronized (this) {
            if (!closed) {
                throw new BankAccountActionInvalidException("Account already open");
            }
            closed = false;
            balance = 0;
        }

    }

    synchronized void close() throws BankAccountActionInvalidException {
        closed = true;
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        } else if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        balance += amount;
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        } else if (balance == 0) {
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        } else if (amount > balance) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        } else if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        balance -= amount;
    }

    synchronized int getBalance() throws BankAccountActionInvalidException {
        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        return balance;
    }

}
