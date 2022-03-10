/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.CustomerModel;

/**
 *
 * @author juan barraza
 */
public class CustomerController {

    public static CustomerModel get(int id) {
        return CustomerModel.index(id);
    }

    public static Boolean delete(int id) {
        return CustomerModel.delete(id);
    }

    public static CustomerModel update(CustomerModel bank) {
        return CustomerModel.Update(bank);
    }

    public static CustomerModel create(CustomerModel bank) {
        return CustomerModel.Create(bank);
    }
}
