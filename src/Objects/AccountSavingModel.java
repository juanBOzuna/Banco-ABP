/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author juan barraza
 */
public class AccountSavingModel {

    private String ccc;
    private Double currentBalance;
    private Double averageBalance;

    public AccountSavingModel(String ccc, Double currentBalance, Double averageBalance) {
        this.ccc = ccc;
        this.currentBalance = currentBalance;
        this.averageBalance = averageBalance;
    }

    public Double getAverageBalance() {
        return averageBalance;
    }

    public void setAverageBalance(Double averageBalance) {
        this.averageBalance = averageBalance;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public static AccountSavingModel index(int ind) {
        //TODO add code of Create account
        return null;
    }

    public static Boolean delete(int id) {
        //TODO add code of delete account
        return null;
    }

    public static AccountSavingModel Update(AccountSavingModel account) {
        //TODO add code of update account
        return null;
    }

    public static AccountSavingModel Create(AccountSavingModel account) {
        //TODO add code of Create account
        return null;
    }

}
