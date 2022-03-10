package Views;

import Constants.Constants;
import Objects.BankModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author juan barraza
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BankModel bank1 = new BankModel("banco1");
        BankModel bank2 = new BankModel("banco2");
        BankModel bank3 = new BankModel("banco3");
        Constants.banks.add(bank1);
        Constants.banks.add(bank2);
        Constants.banks.add(bank3);
        
        for (BankModel bank : Constants.banks) {
            System.out.println(bank.getId() );
        }
        
        AdminHome homeAdmin = new AdminHome();
        
        homeAdmin.setVisible(true);
        
    }
    
}
