/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.OrganizationModel;

/**
 *
 * @author juan barraza
 */
public class OrganizationController {

    public static OrganizationModel get(int id) {
        return OrganizationModel.index(id);
    }

    public static Boolean delete(int id) {
        return OrganizationModel.delete(id);
    }

    public static OrganizationModel update(OrganizationModel bank) {
        return OrganizationModel.Update(bank);
    }

    public static OrganizationModel create(OrganizationModel bank) {
        return OrganizationModel.Create(bank);
    }
}
