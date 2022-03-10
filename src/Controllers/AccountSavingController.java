/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.AccountSavingModel;

/**
 *
 * @author juan barraza
 */
public class AccountSavingController {
     public static AccountSavingModel get(int id) {
        return AccountSavingModel.index(id);
    }

    public static Boolean delete(int id) {
        return AccountSavingModel.delete(id);
    }

    public static AccountSavingModel update(AccountSavingModel bank) {
        return AccountSavingModel.Update(bank);
    }

    public static AccountSavingModel create(AccountSavingModel bank) {
        return AccountSavingModel.Create(bank);
    }
}
