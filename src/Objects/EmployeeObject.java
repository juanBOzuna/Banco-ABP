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
class EmployeeObject extends CustomerObject {

    private BankObject bank;
    private BranchObject branch;

    public EmployeeObject(BankObject bank, BranchObject branch, String dni, String name, String address, Calendar dateOfBirth, String sex) {
        super(dni, name, address, dateOfBirth, sex);
        this.bank = bank;
        this.branch = branch;
    }

    public void setBank(BankObject bank) {
        this.bank = bank;
    }

    public BankObject getBank() {
        return bank;
    }

}
