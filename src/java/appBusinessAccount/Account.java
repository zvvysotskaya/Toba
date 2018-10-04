
package appBusinessAccount;

import appBusinessUser.User;
import java.io.Serializable;
import static java.lang.Double.parseDouble;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import static javax.persistence.FetchType.EAGER;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity

public class Account implements Serializable{
    
    private long accountID;   
    private User account;
    private double amount;   
    private Date transactionDate;
    private long accountUserID;
   
   public Account(){
       transactionDate = new Date();
      
    }

@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }
    public long getAccountUserID() {
        return accountUserID;
    }

    public void setAccountUserID(long accountUserID) {
        this.accountUserID = accountUserID;
    }
 
    public User getAccount() {
        return account;
    }

    public void setAccount(User account) {
        this.account = account;
    }

    @Temporal(TemporalType.DATE)  
public Date getTransactionDate(){
    return transactionDate;
}
public void setTransactionDate(Date transactionDate){
    this.transactionDate = transactionDate;
}

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public double credit(double amount, double balance){
            double total =  (amount + balance) -25.00;  
            
        return total;
    }

    public  double debit(double amount, double balance) {
        
            double total =  (balance - amount) - 25.00;
            
        return total;
    }
public String getTransactionDateDefaultFormat() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String transactionDateFormatted = dateFormat.format(transactionDate);
        return transactionDateFormatted;
    }
      public  String setAccountUserAmountString(){
        String amountString = String.valueOf(amount);
        return amountString;
    }  
      public  String setAccountUserIdString(){
        String accountUserIDS = String.valueOf(accountUserID);
        return accountUserIDS;
    }  
}


