/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Objects.RepresentativeModel;

/**
 *
 * @author juan barraza
 */
public class RepresentativeController {

    public static RepresentativeModel get(int id) {
        return RepresentativeModel.index(id);
    }

    public static Boolean delete(int id) {
        return RepresentativeModel.delete(id);
    }

    public static RepresentativeModel update(RepresentativeModel bank) {
        return RepresentativeModel.Update(bank);
    }

    public static RepresentativeModel create(RepresentativeModel bank) {
        return RepresentativeModel.Create(bank);
    }
}
