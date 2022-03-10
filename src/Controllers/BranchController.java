/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.BranchModel;

/**
 *
 * @author juan barraza
 */
public class BranchController {

    public static BranchModel get(int id) {
        return BranchModel.index(id);
    }

    public static Boolean delete(int id) {
        return BranchModel.delete(id);
    }

    public static BranchModel update(BranchModel bank) {
        return BranchModel.Update(bank);
    }

    public static BranchModel create(BranchModel bank) {
        return BranchModel.Create(bank);
    }
}
