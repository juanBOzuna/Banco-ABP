/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.BranchManagerModel;

/**
 *
 * @author juan barraza
 */
public class BranchManagerController {
    
    public static BranchManagerModel get(int id) {
        return BranchManagerModel.index(id);
    }

    public static Boolean delete(int id) {
        return BranchManagerModel.delete(id);
    }

    public static BranchManagerModel update(BranchManagerModel bank) {
        return BranchManagerModel.Update(bank);
    }

    public static BranchManagerModel create(BranchManagerModel bank) {
        return BranchManagerModel.Create(bank);
    }
}
