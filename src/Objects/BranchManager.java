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
class BranchManager extends CustomerObject {

    private BranchObject branch;

    public BranchManager(BranchObject branch, String dni, String name, String address, Calendar dateOfBirth, String sex) {
        super(dni, name, address, dateOfBirth, sex);
        this.branch = branch;
    }

    public void setBranch(BranchObject branch) {
        this.branch = branch;
    }

    public BranchObject getBranch() {
        return branch;
    }

}
