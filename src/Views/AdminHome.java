/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Constants.Constants;
import Objects.BankModel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author juan barraza
 */
public class AdminHome extends JFrame {

    static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    JPanel panelHead;
    JScrollPane scrollContent;
    JPanel panelContent;
    JLabel title;
    JLabel subTitle;
    JLabel iconAdd;
//    List<JLabel> piclabelsEdit;
//     List<JLabel> piclabelsRemove;
//      List<JLabel> piclabelsEdit;

    public AdminHome() throws HeadlessException {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SOfW(0.8), SOfH(0.8));

        init();
    }

    public void init() {
        panelHead = new JPanel();
        panelContent = new JPanel();
        scrollContent = new JScrollPane();

        panelHead.setLayout(null);
        panelContent.setLayout(null);

        panelHead.setBounds(0, 0, SOfW(0.8), 135);
        panelHead.setBackground(Color.WHITE);

        //scrollContent.setBounds(0, 135, SOfW(0.8), SOfH(0.8) - 135);
        panelContent.setBackground(Color.white);

        scrollContent.setBounds(0, 135, SOfW(0.8) - 16, SOfH(0.8) - 135);
        scrollContent.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        scrollContent.getVerticalScrollBar().setUnitIncrement(20);
        scrollContent.getHorizontalScrollBar().setUnitIncrement(20);

        createTitle();
        createImgAdd();
        createSubTitle();
        createBanks();

        add(panelHead);

        add(scrollContent);

    }

    public void createTitle() {
        title = new JLabel("Bienvenido a Bank Manager");
        title.setForeground(Color.black);
        title.setFont(new Font("Segoe UI Semibold", 0, 45));
        title.setBounds(40, 40, 700, 55);
        panelHead.add(title);
        //panelP.add(title);
    }

    public void createImgAdd() {
        Image imgAdd = new ImageIcon("src/Assets/add.png").getImage();
        ImageIcon imgAdd2 = new ImageIcon(imgAdd.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        iconAdd = new JLabel();
        iconAdd.setIcon(imgAdd2);
        iconAdd.setCursor(new Cursor(HAND_CURSOR));
        iconAdd.setBounds(title.getWidth() + title.getX(), 40, 50, 50);
        panelHead.add(iconAdd);
        // panelP.add(iconAdd);
    }

    public void createSubTitle() {
        subTitle = new JLabel("Listado de Bancos");
        subTitle.setForeground(Color.black);
        subTitle.setFont(new Font("Segoe UI", 0, 20));
        subTitle.setBounds(42, title.getHeight() + title.getY() + 10, 400, 40);
        // panelHead.add(subTitle);
        panelHead.add(subTitle);
        //panelP.add(subTitle);
    }

    public void createBanks() {
        int boundY = 15;

        for (int i = 0; i < Constants.banks.size(); i++) {
            if (i != 0) {
                boundY += 85;
            }
            BankModel bank = Constants.banks.get(i);

            ElementBank element = new ElementBank(this, panelContent, bank.getName(), bank, 2, 40, boundY, SOfW(0.8) - 90, 80);

//            element.getPicLabelDelete().addMouseListener(new MouseAdapter() {
//                @Override
//                public void mousePressed(MouseEvent e) {
//                    updateContent(bank, true, false);
//                }
//            });
//            
//            element.getPicLabelDelete().addMouseListener(new MouseAdapter() {
//                @Override
//                public void mousePressed(MouseEvent e) {
//                    updateContent(bank, true, false);
//                }
//            });
            panelContent.add(element);

        }

        int preferredSize = (85 * Constants.banks.size()) + 15 - 135;

        if (preferredSize <= SOfH(0.8) - 135) {
            preferredSize = SOfH(0.8) - 135;
        }

        //panelP.setPreferredSize(new Dimension(SOfW(0.8), preferredSize));
        panelContent.setPreferredSize(new Dimension(SOfW(0.8), preferredSize));
        scrollContent.setViewportView(panelContent);
    }

    void updateContent(BankModel bank, boolean isDelete, boolean isUpdate) {
//        if (isDelete) {
//            int val = JOptionPane.showConfirmDialog(null, "Elemento a eliminar " + bank.getName());
//            System.out.println(val);
//
//            if (val == 0) {
//                BankModel.delete(bank.getId());
//
//                panelContent.removeAll();
//                panelContent.repaint();
//                panelContent.updateUI();
//                createBanks();
//            }
//        }

//        if (isUpdate) {
//            //BankModel bankM = new BankModel(bank.getName());
//            String name = JOptionPane.showInputDialog("Escriba el nuevo nombre del banco");
//            bank.setName(name);
//            BankModel.Update(bank);
//            panelContent.removeAll();
//            panelContent.repaint();
//            panelContent.updateUI();
//            createBanks();
//        }
    }

    static int SOfW(Double number) {
        return (int) (width * number);
    }

    static int SOfH(Double number) {
        return (int) (height * number);
    }
}

class ElementBank extends JPanel {

    JLabel picLabelDelete;
    JLabel picLabelEdit;
    JLabel picLabelRead;

    JLabel title = new JLabel();

    public ElementBank(AdminHome fr, JPanel panelContent, String nameBank, BankModel bank, int numberOfSedes, int x, int y, int width, int height) {
        setLayout(null);
        this.setBackground(new ColorUIResource(237, 237, 237));
        this.setBounds(x, y, width, height);

        int wImage = 25;

        Image imgDelete = new ImageIcon("src/Assets/remove.png").getImage();
        ImageIcon imgDelete2 = new ImageIcon(imgDelete.getScaledInstance(wImage, wImage, Image.SCALE_SMOOTH));
        picLabelDelete = new JLabel();
        picLabelDelete.setIcon(imgDelete2);
        picLabelDelete.setCursor(new Cursor(HAND_CURSOR));
        picLabelDelete.setBounds(width - 50, (height / 2 - (wImage / 2)), wImage, wImage);

        add(picLabelDelete);

        Image imgEdit = new ImageIcon("src/Assets/edit.png").getImage();
        ImageIcon imgEdit2 = new ImageIcon(imgEdit.getScaledInstance(wImage, wImage, Image.SCALE_SMOOTH));
        picLabelEdit = new JLabel();
        picLabelEdit.setIcon(imgEdit2);
        picLabelEdit.setCursor(new Cursor(HAND_CURSOR));
        picLabelEdit.setBounds(width - 100, (height / 2 - (wImage / 2)), wImage, wImage);
        add(picLabelEdit);

        Image imgRead = new ImageIcon("src/Assets/eye.png").getImage();
        ImageIcon imgRead2 = new ImageIcon(imgRead.getScaledInstance(wImage, wImage, Image.SCALE_SMOOTH));
        picLabelRead = new JLabel();
        picLabelRead.setIcon(imgRead2);
        picLabelRead.setCursor(new Cursor(HAND_CURSOR));
        picLabelRead.setBounds(width - 150, (height / 2 - (wImage / 2)), wImage, wImage);

        add(picLabelRead);

        JPanel title = new JPanel();
        title.setLayout(new GridLayout(1, 1));
        title.setBounds(10, (height / 2) - (((height / 2) - 5) / 2), (width - 150) - 20, (height / 2) - 5);

        JLabel titleText = new JLabel(nameBank);
        title.add(titleText);

        add(title);

        picLabelDelete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fr.updateContent(bank, true, false);
            }
        });

        picLabelEdit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fr.updateContent(bank, false, true);
            }
        });

    }

    public JLabel getPicLabelDelete() {
        return picLabelDelete;
    }

    public JLabel getPicLabelEdit() {
        return picLabelEdit;
    }

    public JLabel getPicLabelRead() {
        return picLabelRead;
    }

}
