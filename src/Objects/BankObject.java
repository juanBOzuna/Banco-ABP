/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author juan barraza
 */
public class BankObject {

    private AtomicInteger id = new AtomicInteger(0);
    private String name;
    private List<BranchObject> branchs = new ArrayList<>();
    private List<EmployeeObject> employees = new ArrayList<>();

    public BankObject(String name) {
        this.name = name;
    }

    public AtomicInteger getId() {
        return id;
    }

    public void setId(AtomicInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BranchObject> getBranchs() {
        return branchs;
    }

    public void setBranch(BranchObject branch) {
        this.branchs.add(branch);
    }

    public List<EmployeeObject> getEmployees() {
        return employees;
    }

    public void setEmployee(EmployeeObject employee) {
        this.employees.add(employee);
    }

}
