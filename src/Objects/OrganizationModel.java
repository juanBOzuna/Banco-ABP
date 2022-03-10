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
public class OrganizationModel {

    private AtomicInteger id;
    private String typeOrganization;
    private Integer numberEmployees;
    private RepresentativeModel representative;
    private List<AccountSavingModel> accountsSaving;
    private List<AccountCurrentModel> accountsCurrent;

    public OrganizationModel(String typeOrganization, Integer numberEmployees, RepresentativeModel representative) {
        this.typeOrganization = typeOrganization;
        this.numberEmployees = numberEmployees;
        this.representative = representative;
    }

    public RepresentativeModel getRepresentative() {
        return representative;
    }

    public void setRepresentative(RepresentativeModel representative) {
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

    public List<AccountSavingModel> getAccountsSaving() {
        return accountsSaving;
    }

    public void setAccountsSaving(AccountSavingModel accountSaving) {
        this.accountsSaving.add(accountSaving);
    }

    public List<AccountCurrentModel> getAccountsCurrent() {
        return accountsCurrent;
    }

    public void setAccountsCurrent(AccountCurrentModel accountCurrent) {
        this.accountsCurrent.add(accountCurrent);
    }

    public static OrganizationModel index(int ind) {
        //TODO add code of Create organization
        return null;
    }

    public static Boolean delete(int id) {
        //TODO add code of delete organization 
        return null;
    }

    public static OrganizationModel Update(OrganizationModel organization) {
        //TODO add code of update organization
        return null;
    }

    public static OrganizationModel Create(OrganizationModel organization) {
        //TODO add code of Create organization
        return null;
    }

}
