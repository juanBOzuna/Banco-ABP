/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.BankModel;

/**
 *
 * @author juan barraza
 */
public class BankController {

    public static BankModel get(int id) {
        return BankModel.index(id);
    }

    public static Boolean delete(int id) {
        return BankModel.delete(id);
    }

    public static BankModel update(BankModel bank) {
        return BankModel.Update(bank);
    }

    public static BankModel create(BankModel bank) {
        return BankModel.Create(bank);
    }

}
