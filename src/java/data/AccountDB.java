/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;



import appBusinessAccount.Account;
import appBusinessTransaction.Transaction;
import appBusinessUser.User;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author zhann
 */
public class AccountDB {
    public static void insert(Account account) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();        
        try {
            em.persist(account);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    } 
     public static Account selectAccountID(long accountID) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        return em.find(Account.class, accountID);
    }
      
    public static void insert(Transaction transaction) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();        
        try {
            em.persist(transaction);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }
    public static List<Account> selectByAccountUserID(String accountUserID) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();

        TypedQuery<Account> q = em.createQuery("SELECT p FROM Account p WHERE p.accountUserID=:accountUserID", Account.class);
        q.setParameter("accountUserID", accountUserID);
        List<Account> accounts;
        try {
            accounts = q.getResultList();
            if (accounts == null || accounts.isEmpty()) {
                accounts = null;
            }
        } finally {
            em.close();
        }
        return accounts;
    }
    
}
