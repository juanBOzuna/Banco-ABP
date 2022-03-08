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
class BranchObject {

    private AtomicInteger id;
    private String address;
    private String zip;
    private String city;
    private BankObject bank;
    private List<EmployeeObject> employees;
    private List<CustomerObject> customers;
    private List<Organization> organizations;
    private BranchManager branchManager;

    public BranchObject(AtomicInteger id, String address, String zip, String city, BankObject bank, BranchManager branchManager) {
        this.id = id;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.bank = bank;
        this.branchManager = branchManager;
    }

    public BranchManager getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(BranchManager branchManager) {
        this.branchManager = branchManager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BankObject getBank() {
        return bank;
    }

    public void setBank(BankObject bank) {
        this.bank = bank;
    }

    public List<EmployeeObject> getEmployees() {
        return employees;
    }

    public void setEmployee(EmployeeObject employee) {
        this.employees.add(employee);
    }

    public List<CustomerObject> getCustomers() {
        return customers;
    }

    public void setCustomer(CustomerObject customer) {
        this.customers.add(customer);
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganization(Organization organization) {
        this.organizations.add(organization);
    }

    public AtomicInteger getId() {
        return id;
    }

    public void setId(AtomicInteger id) {
        this.id = id;
    }

}
