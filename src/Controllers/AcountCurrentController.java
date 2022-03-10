/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.AccountCurrentModel;


/**
 *
 * @author juan barraza
 */
public class AcountCurrentController {
     public static AccountCurrentModel get(int id) {
        return AccountCurrentModel.index(id);
    }

    public static Boolean delete(int id) {
        return AccountCurrentModel.delete(id);
    }

    public static AccountCurrentModel update(AccountCurrentModel bank) {
        return AccountCurrentModel.Update(bank);
    }

    public static AccountCurrentModel create(AccountCurrentModel bank) {
        return AccountCurrentModel.Create(bank);
    }
}
