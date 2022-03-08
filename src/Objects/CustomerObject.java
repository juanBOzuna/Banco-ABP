/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author juan barraza
 */
class CustomerObject {

    private AtomicInteger id;
    private String dni;
    private String name;
    private String address;
    private Calendar dateOfBirth;
    private String sex;
    private List<AccountSaving> accountsSaving;
    private List<AccountCurrent> accountsCurrent;

    public CustomerObject(String dni, String name, String address, Calendar dateOfBirth, String sex) {
        this.dni = dni;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<AccountSaving> getAccountsSaving() {
        return accountsSaving;
    }

    public void setAccountSaving(AccountSaving accountSaving) {
        this.accountsSaving.add(accountSaving);
    }

    public List<AccountCurrent> getAccountsCurrent() {
        return accountsCurrent;
    }

    public void setAccountCurrent(AccountCurrent accountCurrent) {
        this.accountsCurrent.add(accountCurrent);
    }

}
