/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import static Constants.Constants.banks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author juan barraza
 */
public class BankModel {

    private int id;
    private String name;
    private List<BranchModel> branchs = new ArrayList<>();
    private List<EmployeeModel> employees = new ArrayList<>();

    public BankModel(String name) {
        int idMax = 0;

        for (BankModel bankO : Constants.Constants.banks) {
            if (idMax < bankO.getId()) {
                idMax = bankO.getId();
            }
        }

        this.id = idMax;
        System.out.println("id en el objeto: " + id);

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BranchModel> getBranchs() {
        return branchs;
    }

    public void setBranch(BranchModel branch) {
        this.branchs.add(branch);
    }

    public List<EmployeeModel> getEmployees() {
        return employees;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employees.add(employee);
    }

    public static BankModel index(int ind) {
        //TODO add code of Create bank
        return null;
    }

    public static Boolean delete(int id) {
        //TODO add code of delete bank
        return null;
    }

    public static BankModel Update(BankModel bank) {
        //TODO add code of update bank
        return null;
    }

    public static BankModel Create(BankModel bank) {
        //TODO add code of Create bank
        return null;
    }

}
