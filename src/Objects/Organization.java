/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author juan barraza
 */
class Organization {
    private AtomicInteger id;
    private String typeOrganization;
    private Integer numberEmployees;
    private Representative representative;
    private List<AccountSaving> accountsSaving;
    private List<AccountCurrent> accountsCurrent;

    public Organization( String typeOrganization, Integer numberEmployees, Representative representative) {
        this.typeOrganization = typeOrganization;
        this.numberEmployees = numberEmployees;
        this.representative = representative;
    }

    public Representative getRepresentative() {
        return representative;
    }

    public void setRepresentative(Representative representative) {
        this.representative = representative;
    }

    public String getTypeOrganization() {
        return typeOrganization;
    }

    public void setTypeOrganization(String typeOrganization) {
        this.typeOrganization = typeOrganization;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public List<AccountSaving> getAccountsSaving() {
        return accountsSaving;
    }

    public void setAccountsSaving(AccountSaving accountSaving) {
        this.accountsSaving.add(accountSaving);
    }

    public List<AccountCurrent> getAccountsCurrent() {
        return accountsCurrent;
    }

    public void setAccountsCurrent(AccountCurrent accountCurrent) {
        this.accountsCurrent.add(accountCurrent);
    }
    
    
    
    
}
