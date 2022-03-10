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
public class BranchManagerModel extends CustomerModel {

    private BranchModel branch;

    public BranchManagerModel(BranchModel branch, String dni, String name, String address, Calendar dateOfBirth, String sex) {
        super(dni, name, address, dateOfBirth, sex);
        this.branch = branch;
    }

    public void setBranch(BranchModel branch) {
        this.branch = branch;
    }

    public BranchModel getBranch() {
        return branch;
    }

    public static BranchManagerModel index(int ind) {
        //TODO add code of Create branch Manager
        return null;
    }

    public static Boolean delete(int id) {
        //TODO add code of delete branch Manager
        return null;
    }

    public static BranchManagerModel Update(BranchManagerModel branchManager) {
        //TODO add code of update branchManager
        return null;
    }

    public static BranchManagerModel Create(BranchManagerModel branchManager) {
        //TODO add code of Create branchManager
        return null;
    }

}
