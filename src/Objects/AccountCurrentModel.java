/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import static Constants.Constants.banks;

/**
 *
 * @author juan barraza
 */
public class AccountCurrentModel {

    private String ccc;
    private Double currentBalance;
    private Double averageBalance;
    private Double amortizacion;

    public AccountCurrentModel(String ccc, Double currentBalance, Double averageBalance, Double amortizacion) {
        this.ccc = ccc;
        this.currentBalance = currentBalance;
        this.averageBalance = averageBalance;
        this.amortizacion = amortizacion;
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

    public void setAmortizacion(Double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public Double getAmortizacion() {
        return amortizacion;
    }

    public static AccountCurrentModel index(int ind) {
        //TODO add code of Create Account 
        return null;
    }

    public static Boolean delete(int id) {
        //TODO add code of delete account
        return null;
    }

    public static AccountCurrentModel Update(AccountCurrentModel account) {
        //TODO add code of update account
        return null;
    }

    public static AccountCurrentModel Create(AccountCurrentModel account) {
        //TODO add code of Create account
        return null;
    }

}
