
package appBusinessTransaction;

import appBusinessAccount.Account;
import data.UserDB;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import static javax.persistence.FetchType.EAGER;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class Transaction implements Serializable {

    private ArrayList<Account> transactions;
private Long transactionID;
    public Transaction() {
        transactions = new ArrayList<Account>();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public ArrayList<Account> getTransactions() {
        return transactions;
    }

    public void addTransaction(Account transaction) {
        String ss = transaction.getAccount().getEmail();
        if (UserDB.emailExists(ss)) {
            transactions.add(transaction);
        }
    }
}
