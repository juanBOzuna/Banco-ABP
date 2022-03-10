/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.EmployeeModel;

/**
 *
 * @author juan barraza
 */
public class EmployeeController {

    public static EmployeeModel get(int id) {
        return EmployeeModel.index(id);
    }

    public static Boolean delete(int id) {
        return EmployeeModel.delete(id);
    }

    public static EmployeeModel update(EmployeeModel bank) {
        return EmployeeModel.Update(bank);
    }

    public static EmployeeModel create(EmployeeModel bank) {
        return EmployeeModel.Create(bank);
    }
}
