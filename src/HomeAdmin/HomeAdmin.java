/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeAdmin;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author juan barraza
 */
public class HomeAdmin extends JFrame {
    
    JPanel panelP;
    JMenuBar menu;

    JMenu menuBanks;
    JMenuItem cBank, rBank, uBank, dBank;

    public HomeAdmin() {
        this.setVisible(true);
        this.setSize(500, 500);
        
         menu = new JMenuBar();
        menuBanks = new JMenu("BAncos");
        cBank = new JMenuItem("Crear");
        rBank = new JMenuItem("Leer");
        uBank = new JMenuItem("Actualizar");
        dBank = new JMenuItem("Eliminar");
        menuBanks.add(cBank);
        menuBanks.add(rBank);
        menuBanks.add(uBank);
        menuBanks.add(dBank);

        menu.add(menuBanks);

        this.setJMenuBar(menu);
    }

    public void init() {
        
     

    }

}
