/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.Calendar;

/**
 *
 * @author juan barraza
 */
public class EmployeeModel extends CustomerModel {

    private BankModel bank;
    private BranchModel branch;

    public EmployeeModel(BankModel bank, BranchModel branch, String dni, String name, String address, Calendar dateOfBirth, String sex) {
        super(dni, name, address, dateOfBirth, sex);
        this.bank = bank;
        this.branch = branch;
    }

    public void setBank(BankModel bank) {
        this.bank = bank;
    }

    public BankModel getBank() {
        return bank;
    }

    public static EmployeeModel index(int ind) {
        //TODO add code of Create bank
        return null;
    }

    public static Boolean delete(EmployeeModel employee) {
        //TODO add code of delete employee 
        return null;
    }

    public static EmployeeModel Update(EmployeeModel employee) {
        //TODO add code of update employee
        return null;
    }

    public static EmployeeModel Create(EmployeeModel employee) {
        //TODO add code of Create employee
        return null;
    }

}
