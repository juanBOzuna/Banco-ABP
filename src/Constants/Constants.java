/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constants;

import Objects.BankModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan barraza
 */
public class Constants {

    public static List<BankModel> banks = new ArrayList<>();

    public static void deleteBank(BankModel bank) {

        for (int i = 0; i < banks.size(); i++) {
            if (banks.get(i).getName().equals(bank.getName())) {
                banks.remove(i);
            }

        }
        for (int i = 0; i < banks.size(); i++) {
            if (banks.get(i).getName().equals(bank.getName())) {
                banks.remove(i);
            }

        }

    }

}
