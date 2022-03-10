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
public class BranchModel {

    private AtomicInteger id;
    private String address;
    private String name;
    private String zip;
    private String city;
    private BankModel bank;
    private List<EmployeeModel> employees;
    private List<CustomerModel> customers;
    private List<OrganizationModel> organizations;
    private BranchManagerModel branchManager;

    public BranchModel(AtomicInteger id, String address, String zip, String city, BankModel bank, BranchManagerModel branchManager) {
        this.id = id;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.bank = bank;
        this.branchManager = branchManager;
    }

    public BranchManagerModel getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(BranchManagerModel branchManager) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BankModel getBank() {
        return bank;
    }

    public void setBank(BankModel bank) {
        this.bank = bank;
    }

    public List<EmployeeModel> getEmployees() {
        return employees;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employees.add(employee);
    }

    public List<CustomerModel> getCustomers() {
        return customers;
    }

    public void setCustomer(CustomerModel customer) {
        this.customers.add(customer);
    }

    public List<OrganizationModel> getOrganizations() {
        return organizations;
    }

    public void setOrganization(OrganizationModel organization) {
        this.organizations.add(organization);
    }

    public AtomicInteger getId() {
        return id;
    }

    public void setId(AtomicInteger id) {
        this.id = id;
    }

    public static BranchModel index(int ind) {
        //TODO add code of Create branch
        return null;
    }

    public static Boolean delete(int id) {
        //TODO add code of delete branch 
        return null;
    }

    public static BranchModel Update(BranchModel branch) {
        //TODO add code of update branch
        return null;
    }

    public static BranchModel Create(BranchModel branch) {
        //TODO add code of Create branch
        return null;
    }

}
